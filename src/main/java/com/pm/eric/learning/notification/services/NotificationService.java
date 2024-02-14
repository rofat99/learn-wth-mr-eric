package com.pm.eric.learning.notification.services;

import com.pm.eric.learning.notification.models.dto.NotificationDTO;
import com.pm.eric.learning.notification.models.entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification create(NotificationDTO notificationDTO);
    Notification update(Long id, NotificationDTO  notificationDTO);
    Notification get(Long id);
    List<Notification> getList();
    String delete(Long id);
}
