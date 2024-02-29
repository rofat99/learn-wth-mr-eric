package com.pm.eric.learning.services;

import com.pm.eric.learning.models.dto.NotificationDTO;
import com.pm.eric.learning.models.entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification create(NotificationDTO notificationDTO);
    Notification update(Long id, NotificationDTO  notificationDTO);
    Notification get(Long id);
    List<Notification> getList();
    String delete(Long id);
}
