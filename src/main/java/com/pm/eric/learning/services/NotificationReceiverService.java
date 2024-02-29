package com.pm.eric.learning.services;

import com.pm.eric.learning.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.models.entity.NotificationReceiver;

import java.util.List;

public interface NotificationReceiverService {
    NotificationReceiver create(NotificationReceiverDTO notificationDTO);
    NotificationReceiver get(Long id);
    List<NotificationReceiver> getList();
    NotificationReceiver update(Long id, NotificationReceiverDTO notificationReceiverDTO);
    String delete(Long id);
}
