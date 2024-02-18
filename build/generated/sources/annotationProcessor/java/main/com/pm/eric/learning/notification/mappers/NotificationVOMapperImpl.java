package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationDTO;
import com.pm.eric.learning.notification.models.entity.Notification;
import com.pm.eric.learning.notification.vo.notification.NotificationCreateRequestVO;
import com.pm.eric.learning.notification.vo.notification.NotificationCreateResponseVO;
import com.pm.eric.learning.notification.vo.notification.NotificationResponseVO;
import com.pm.eric.learning.notification.vo.notification.NotificationUpdateRequestVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T15:33:57+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class NotificationVOMapperImpl implements NotificationVOMapper {

    @Override
    public NotificationDTO from(NotificationCreateRequestVO notificationCreateRequestVO) {
        if ( notificationCreateRequestVO == null ) {
            return null;
        }

        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setName( notificationCreateRequestVO.getName() );
        notificationDTO.setDescription( notificationCreateRequestVO.getDescription() );
        notificationDTO.setEventId( notificationCreateRequestVO.getEventId() );
        notificationDTO.setOrganizationId( notificationCreateRequestVO.getOrganizationId() );

        return notificationDTO;
    }

    @Override
    public NotificationDTO fromUpdate(NotificationUpdateRequestVO notificationUpdateRequestVO) {
        if ( notificationUpdateRequestVO == null ) {
            return null;
        }

        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setName( notificationUpdateRequestVO.getName() );
        notificationDTO.setDescription( notificationUpdateRequestVO.getDescription() );
        notificationDTO.setEventId( notificationUpdateRequestVO.getEventId() );
        notificationDTO.setOrganizationId( notificationUpdateRequestVO.getOrganizationId() );

        return notificationDTO;
    }

    @Override
    public NotificationCreateResponseVO toNotificationCreateResponse(Notification notification) {
        if ( notification == null ) {
            return null;
        }

        NotificationCreateResponseVO notificationCreateResponseVO = new NotificationCreateResponseVO();

        notificationCreateResponseVO.setId( notification.getId() );
        notificationCreateResponseVO.setName( notification.getName() );
        notificationCreateResponseVO.setDescription( notification.getDescription() );
        notificationCreateResponseVO.setEventId( notification.getEventId() );
        notificationCreateResponseVO.setOrganizationId( notification.getOrganizationId() );
        notificationCreateResponseVO.setCreatedAt( notification.getCreatedAt() );

        return notificationCreateResponseVO;
    }

    @Override
    public NotificationResponseVO toNotificationResponse(Notification notification) {
        if ( notification == null ) {
            return null;
        }

        NotificationResponseVO notificationResponseVO = new NotificationResponseVO();

        notificationResponseVO.setId( notification.getId() );
        notificationResponseVO.setName( notification.getName() );
        notificationResponseVO.setDescription( notification.getDescription() );
        notificationResponseVO.setEventId( notification.getEventId() );
        notificationResponseVO.setOrganizationId( notification.getOrganizationId() );
        notificationResponseVO.setCreatedAt( notification.getCreatedAt() );
        notificationResponseVO.setUpdatedAt( notification.getUpdatedAt() );
        notificationResponseVO.setDeletedAt( notification.getDeletedAt() );

        return notificationResponseVO;
    }

    @Override
    public List<NotificationResponseVO> toNotificationResponse(List<Notification> notificationList) {
        if ( notificationList == null ) {
            return null;
        }

        List<NotificationResponseVO> list = new ArrayList<NotificationResponseVO>( notificationList.size() );
        for ( Notification notification : notificationList ) {
            list.add( toNotificationResponse( notification ) );
        }

        return list;
    }
}
