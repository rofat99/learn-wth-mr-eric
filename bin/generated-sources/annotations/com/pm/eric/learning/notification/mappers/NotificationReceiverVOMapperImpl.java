package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.notification.models.entity.NotificationReceiver;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverCreateRequestVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverCreateResponseVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverResponseVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverUpdateRequestVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T21:51:21+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class NotificationReceiverVOMapperImpl implements NotificationReceiverVOMapper {

    @Override
    public NotificationReceiverDTO from(NotificationReceiverCreateRequestVO notificationReceiverCreateRequestVO) {
        if ( notificationReceiverCreateRequestVO == null ) {
            return null;
        }

        NotificationReceiverDTO notificationReceiverDTO = new NotificationReceiverDTO();

        notificationReceiverDTO.setDeviceId( notificationReceiverCreateRequestVO.getDeviceId() );
        notificationReceiverDTO.setNotificationId( notificationReceiverCreateRequestVO.getNotificationId() );
        notificationReceiverDTO.setOrganizationId( notificationReceiverCreateRequestVO.getOrganizationId() );
        notificationReceiverDTO.setUserId( notificationReceiverCreateRequestVO.getUserId() );

        return notificationReceiverDTO;
    }

    @Override
    public NotificationReceiverDTO fromUpdate(NotificationReceiverUpdateRequestVO notificationReceiverUpdateRequestVO) {
        if ( notificationReceiverUpdateRequestVO == null ) {
            return null;
        }

        NotificationReceiverDTO notificationReceiverDTO = new NotificationReceiverDTO();

        notificationReceiverDTO.setCreatedAt( notificationReceiverUpdateRequestVO.getCreatedAt() );
        notificationReceiverDTO.setDeviceId( notificationReceiverUpdateRequestVO.getDeviceId() );
        notificationReceiverDTO.setId( notificationReceiverUpdateRequestVO.getId() );
        notificationReceiverDTO.setNotificationId( notificationReceiverUpdateRequestVO.getNotificationId() );
        notificationReceiverDTO.setOrganizationId( notificationReceiverUpdateRequestVO.getOrganizationId() );
        notificationReceiverDTO.setUpdatedAt( notificationReceiverUpdateRequestVO.getUpdatedAt() );
        notificationReceiverDTO.setUserId( notificationReceiverUpdateRequestVO.getUserId() );

        return notificationReceiverDTO;
    }

    @Override
    public NotificationReceiverResponseVO toNotificationReceiverResponse(NotificationReceiver notificationReceiver) {
        if ( notificationReceiver == null ) {
            return null;
        }

        NotificationReceiverResponseVO notificationReceiverResponseVO = new NotificationReceiverResponseVO();

        notificationReceiverResponseVO.setCreatedAt( notificationReceiver.getCreatedAt() );
        notificationReceiverResponseVO.setDeletedAt( notificationReceiver.getDeletedAt() );
        notificationReceiverResponseVO.setDeviceId( notificationReceiver.getDeviceId() );
        notificationReceiverResponseVO.setId( notificationReceiver.getId() );
        notificationReceiverResponseVO.setNotificationId( notificationReceiver.getNotificationId() );
        notificationReceiverResponseVO.setOrganizationId( notificationReceiver.getOrganizationId() );
        notificationReceiverResponseVO.setUpdatedAt( notificationReceiver.getUpdatedAt() );
        notificationReceiverResponseVO.setUserId( notificationReceiver.getUserId() );

        return notificationReceiverResponseVO;
    }

    @Override
    public NotificationReceiverCreateResponseVO toNotificationReceiverCreateResponse(NotificationReceiver notificationReceiver) {
        if ( notificationReceiver == null ) {
            return null;
        }

        NotificationReceiverCreateResponseVO notificationReceiverCreateResponseVO = new NotificationReceiverCreateResponseVO();

        notificationReceiverCreateResponseVO.setCreatedAt( notificationReceiver.getCreatedAt() );
        notificationReceiverCreateResponseVO.setDeviceId( notificationReceiver.getDeviceId() );
        notificationReceiverCreateResponseVO.setId( notificationReceiver.getId() );
        notificationReceiverCreateResponseVO.setNotificationId( notificationReceiver.getNotificationId() );
        notificationReceiverCreateResponseVO.setOrganizationId( notificationReceiver.getOrganizationId() );
        notificationReceiverCreateResponseVO.setUserId( notificationReceiver.getUserId() );

        return notificationReceiverCreateResponseVO;
    }

    @Override
    public List<NotificationReceiverResponseVO> toNotificationReceiverListResponse(List<NotificationReceiver> notificationReceiverList) {
        if ( notificationReceiverList == null ) {
            return null;
        }

        List<NotificationReceiverResponseVO> list = new ArrayList<NotificationReceiverResponseVO>( notificationReceiverList.size() );
        for ( NotificationReceiver notificationReceiver : notificationReceiverList ) {
            list.add( toNotificationReceiverResponse( notificationReceiver ) );
        }

        return list;
    }
}
