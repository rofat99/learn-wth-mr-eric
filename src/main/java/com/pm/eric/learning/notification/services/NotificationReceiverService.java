package com.pm.eric.learning.notification.services;

import com.pm.eric.learning.notification.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.notification.models.entity.NotificationReceiver;

import java.util.List;

public interface NotificationReceiverService {
    NotificationReceiver create(NotificationReceiverDTO notificationDTO);
    NotificationReceiver get(Long id);
    List<NotificationReceiver> getList();
    NotificationReceiver update(Long id, NotificationReceiverDTO notificationReceiverDTO);
    String delete(Long id);
}
