package com.pm.eric.learning.notification.services.impl;

import com.pm.eric.learning.notification.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.notification.models.entity.NotificationReceiver;
import com.pm.eric.learning.notification.services.NotificationReceiverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationReceiverServiceImpl implements NotificationReceiverService {

    @Override
    public NotificationReceiver create(NotificationReceiverDTO notificationDTO) {
        return null;
    }

    @Override
    public NotificationReceiver get(Long id) {
        return null;
    }

    @Override
    public List<NotificationReceiver> getList() {
        return null;
    }

    @Override
    public NotificationReceiver update(Long id, NotificationReceiverDTO notificationReceiverDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
