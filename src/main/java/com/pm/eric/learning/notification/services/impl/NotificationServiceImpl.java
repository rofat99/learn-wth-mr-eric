package com.pm.eric.learning.notification.services.impl;

import com.pm.eric.learning.notification.models.dto.NotificationDTO;
import com.pm.eric.learning.notification.models.entity.Notification;
import com.pm.eric.learning.notification.services.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public Notification create(NotificationDTO notificationDTO) {
        return null;
    }

    @Override
    public Notification update(Long id, NotificationDTO notificationDTO) {
        return null;
    }

    @Override
    public Notification get(Long id) {
        return null;
    }

    @Override
    public List<Notification> getList() {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
