package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationDTO;
import com.pm.eric.learning.notification.models.entity.Notification;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T21:51:21+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public Notification from(NotificationDTO notificationDTO) {
        if ( notificationDTO == null ) {
            return null;
        }

        Notification notification = new Notification();

        notification.setDescription( notificationDTO.getDescription() );
        notification.setEventId( notificationDTO.getEventId() );
        notification.setName( notificationDTO.getName() );
        notification.setOrganizationId( notificationDTO.getOrganizationId() );

        return notification;
    }

    @Override
    public void updateFromSourceToTarget(NotificationDTO notificationDTO, Notification notification) {
        if ( notificationDTO == null ) {
            return;
        }

        notification.setDescription( notificationDTO.getDescription() );
        notification.setEventId( notificationDTO.getEventId() );
        notification.setName( notificationDTO.getName() );
        notification.setOrganizationId( notificationDTO.getOrganizationId() );
    }
}
