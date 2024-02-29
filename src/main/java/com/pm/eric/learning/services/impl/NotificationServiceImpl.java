package com.pm.eric.learning.services.impl;

import com.pm.eric.learning.mappers.NotificationMapper;
import com.pm.eric.learning.models.repository.NotificationRepository;
import com.pm.eric.learning.models.dto.NotificationDTO;
import com.pm.eric.learning.models.entity.Notification;
import com.pm.eric.learning.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;
//    @Autowired
    private final NotificationMapper notificationMapper;

    NotificationServiceImpl(NotificationMapper notificationMapper){
        this.notificationMapper = notificationMapper;
    }

    @Override
    public Notification create(NotificationDTO notificationDTO) {
        Notification notification = notificationMapper.from(notificationDTO);
        return notificationRepository.save(notification);
    }

    @Override
    public Notification update(Long id, NotificationDTO notificationDTO) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        if(optionalNotification.isPresent()){
            Notification notification = optionalNotification.get();
            notificationMapper.updateFromSourceToTarget(notificationDTO, notification);
            return notificationRepository.save(notification);
        } else {
            throw new RuntimeException("Notification is not exist");
        }
    }

    @Override
    public Notification get(Long id) {
        return notificationRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Notification> getList() {
        return notificationRepository.findAll();
    }

    @Override
    public String delete(Long id) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        if(optionalNotification.isPresent()){
            try{
              Notification notification = optionalNotification.get();
              notification.setDeletedAt(LocalDateTime.now());
              notificationRepository.save(notification);
              return "success";
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        else {
            throw new RuntimeException("Notification is not exist");
        }
    }
}
