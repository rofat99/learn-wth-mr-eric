package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.notification.models.entity.NotificationReceiver;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T21:51:21+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class NotificationReceiverMapperImpl implements NotificationReceiverMapper {

    @Override
    public NotificationReceiver from(NotificationReceiverDTO notificationReceiverDTO) {
        if ( notificationReceiverDTO == null ) {
            return null;
        }

        NotificationReceiver notificationReceiver = new NotificationReceiver();

        notificationReceiver.setDeviceId( notificationReceiverDTO.getDeviceId() );
        notificationReceiver.setNotificationId( notificationReceiverDTO.getNotificationId() );
        notificationReceiver.setOrganizationId( notificationReceiverDTO.getOrganizationId() );
        notificationReceiver.setUserId( notificationReceiverDTO.getUserId() );

        return notificationReceiver;
    }

    @Override
    public void updateFromSourceToTarget(NotificationReceiverDTO notificationReceiverDTO, NotificationReceiver notificationReceiver) {
        if ( notificationReceiverDTO == null ) {
            return;
        }

        notificationReceiver.setDeviceId( notificationReceiverDTO.getDeviceId() );
        notificationReceiver.setNotificationId( notificationReceiverDTO.getNotificationId() );
        notificationReceiver.setOrganizationId( notificationReceiverDTO.getOrganizationId() );
        notificationReceiver.setUserId( notificationReceiverDTO.getUserId() );
    }
}
