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
    date = "2024-02-17T22:55:01+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class NotificationVOMapperImpl implements NotificationVOMapper {

    @Override
    public NotificationDTO from(NotificationCreateRequestVO notificationCreateRequestVO) {
        if ( notificationCreateRequestVO == null ) {
            return null;
        }

        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setDescription( notificationCreateRequestVO.getDescription() );
        notificationDTO.setEventId( notificationCreateRequestVO.getEventId() );
        notificationDTO.setName( notificationCreateRequestVO.getName() );
        notificationDTO.setOrganizationId( notificationCreateRequestVO.getOrganizationId() );

        return notificationDTO;
    }

    @Override
    public NotificationDTO fromUpdate(NotificationUpdateRequestVO notificationUpdateRequestVO) {
        if ( notificationUpdateRequestVO == null ) {
            return null;
        }

        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setDescription( notificationUpdateRequestVO.getDescription() );
        notificationDTO.setEventId( notificationUpdateRequestVO.getEventId() );
        notificationDTO.setName( notificationUpdateRequestVO.getName() );
        notificationDTO.setOrganizationId( notificationUpdateRequestVO.getOrganizationId() );

        return notificationDTO;
    }

    @Override
    public NotificationCreateResponseVO toNotificationCreateResponse(Notification notification) {
        if ( notification == null ) {
            return null;
        }

        NotificationCreateResponseVO notificationCreateResponseVO = new NotificationCreateResponseVO();

        notificationCreateResponseVO.setCreatedAt( notification.getCreatedAt() );
        notificationCreateResponseVO.setDescription( notification.getDescription() );
        notificationCreateResponseVO.setEventId( notification.getEventId() );
        notificationCreateResponseVO.setId( notification.getId() );
        notificationCreateResponseVO.setName( notification.getName() );
        notificationCreateResponseVO.setOrganizationId( notification.getOrganizationId() );

        return notificationCreateResponseVO;
    }

    @Override
    public NotificationResponseVO toNotificationResponse(Notification notification) {
        if ( notification == null ) {
            return null;
        }

        NotificationResponseVO notificationResponseVO = new NotificationResponseVO();

        notificationResponseVO.setCreatedAt( notification.getCreatedAt() );
        notificationResponseVO.setDeletedAt( notification.getDeletedAt() );
        notificationResponseVO.setDescription( notification.getDescription() );
        notificationResponseVO.setEventId( notification.getEventId() );
        notificationResponseVO.setId( notification.getId() );
        notificationResponseVO.setName( notification.getName() );
        notificationResponseVO.setOrganizationId( notification.getOrganizationId() );
        notificationResponseVO.setUpdatedAt( notification.getUpdatedAt() );

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
