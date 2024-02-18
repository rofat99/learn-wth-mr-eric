package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.notification.models.entity.NotificationReceiver;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T14:24:27+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class NotificationReceiverMapperImpl implements NotificationReceiverMapper {

    @Override
    public NotificationReceiver from(NotificationReceiverDTO notificationReceiverDTO) {
        if ( notificationReceiverDTO == null ) {
            return null;
        }

        NotificationReceiver notificationReceiver = new NotificationReceiver();

        notificationReceiver.setNotificationId( notificationReceiverDTO.getNotificationId() );
        notificationReceiver.setUserId( notificationReceiverDTO.getUserId() );
        notificationReceiver.setDeviceId( notificationReceiverDTO.getDeviceId() );
        notificationReceiver.setOrganizationId( notificationReceiverDTO.getOrganizationId() );

        return notificationReceiver;
    }

    @Override
    public void updateFromSourceToTarget(NotificationReceiverDTO notificationReceiverDTO, NotificationReceiver notificationReceiver) {
        if ( notificationReceiverDTO == null ) {
            return;
        }

        notificationReceiver.setNotificationId( notificationReceiverDTO.getNotificationId() );
        notificationReceiver.setUserId( notificationReceiverDTO.getUserId() );
        notificationReceiver.setDeviceId( notificationReceiverDTO.getDeviceId() );
        notificationReceiver.setOrganizationId( notificationReceiverDTO.getOrganizationId() );
    }
}
