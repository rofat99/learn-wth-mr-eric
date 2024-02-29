package com.pm.eric.learning.services.impl;

import com.pm.eric.learning.mappers.NotificationReceiverMapper;
import com.pm.eric.learning.models.repository.NotificationReceiverRepository;
import com.pm.eric.learning.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.models.entity.NotificationReceiver;
import com.pm.eric.learning.services.NotificationReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationReceiverServiceImpl implements NotificationReceiverService {
    @Autowired
    private NotificationReceiverRepository notificationReceiverRepository;
    @Autowired
    private NotificationReceiverMapper notificationReceiverMapper;
    @Override
    public NotificationReceiver create(NotificationReceiverDTO notificationReceiverDTO) {
        NotificationReceiver notificationReceiver = notificationReceiverMapper.from(notificationReceiverDTO);
        return notificationReceiverRepository.save(notificationReceiver);
    }

    @Override
    public NotificationReceiver get(Long id) {
        return notificationReceiverRepository.findById(id).orElseThrow();
    }

    @Override
    public List<NotificationReceiver> getList() {
        return notificationReceiverRepository.findAll();
    }

    @Override
    public NotificationReceiver update(Long id, NotificationReceiverDTO notificationReceiverDTO) {
        Optional<NotificationReceiver> optionalNotificationReceiver = notificationReceiverRepository.findById(id);
        if(optionalNotificationReceiver.isPresent())
        {
            NotificationReceiver  notificationReceiver = optionalNotificationReceiver.get();
            notificationReceiverMapper.updateFromSourceToTarget(notificationReceiverDTO, notificationReceiver);
            return notificationReceiverRepository.save(notificationReceiver);
        } else {
            throw new RuntimeException("Notification Receiver is not exist");
        }
    }

    @Override
    public String delete(Long id) {
        Optional<NotificationReceiver> optionalNotificationReceiver = notificationReceiverRepository.findById(id);
        if(optionalNotificationReceiver.isPresent())
        {
            NotificationReceiver notificationReceiver = optionalNotificationReceiver.get();
            notificationReceiver.setDeletedAt(LocalDateTime.now());
            notificationReceiverRepository.save(notificationReceiver);
            return "success";
        } else {
            throw new RuntimeException("Notification Receiver is not exist");
        }
    }
}
