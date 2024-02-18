package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationDTO;
import com.pm.eric.learning.notification.models.entity.Notification;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T14:24:27+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public Notification from(NotificationDTO notificationDTO) {
        if ( notificationDTO == null ) {
            return null;
        }

        Notification notification = new Notification();

        notification.setName( notificationDTO.getName() );
        notification.setDescription( notificationDTO.getDescription() );
        notification.setEventId( notificationDTO.getEventId() );
        notification.setOrganizationId( notificationDTO.getOrganizationId() );

        return notification;
    }

    @Override
    public void updateFromSourceToTarget(NotificationDTO notificationDTO, Notification notification) {
        if ( notificationDTO == null ) {
            return;
        }

        notification.setName( notificationDTO.getName() );
        notification.setDescription( notificationDTO.getDescription() );
        notification.setEventId( notificationDTO.getEventId() );
        notification.setOrganizationId( notificationDTO.getOrganizationId() );
    }
}
