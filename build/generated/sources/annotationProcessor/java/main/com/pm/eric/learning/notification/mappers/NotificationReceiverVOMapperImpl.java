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
    date = "2024-02-18T15:33:57+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class NotificationReceiverVOMapperImpl implements NotificationReceiverVOMapper {

    @Override
    public NotificationReceiverDTO from(NotificationReceiverCreateRequestVO notificationReceiverCreateRequestVO) {
        if ( notificationReceiverCreateRequestVO == null ) {
            return null;
        }

        NotificationReceiverDTO notificationReceiverDTO = new NotificationReceiverDTO();

        notificationReceiverDTO.setNotificationId( notificationReceiverCreateRequestVO.getNotificationId() );
        notificationReceiverDTO.setUserId( notificationReceiverCreateRequestVO.getUserId() );
        notificationReceiverDTO.setDeviceId( notificationReceiverCreateRequestVO.getDeviceId() );
        notificationReceiverDTO.setOrganizationId( notificationReceiverCreateRequestVO.getOrganizationId() );

        return notificationReceiverDTO;
    }

    @Override
    public NotificationReceiverDTO fromUpdate(NotificationReceiverUpdateRequestVO notificationReceiverUpdateRequestVO) {
        if ( notificationReceiverUpdateRequestVO == null ) {
            return null;
        }

        NotificationReceiverDTO notificationReceiverDTO = new NotificationReceiverDTO();

        notificationReceiverDTO.setId( notificationReceiverUpdateRequestVO.getId() );
        notificationReceiverDTO.setNotificationId( notificationReceiverUpdateRequestVO.getNotificationId() );
        notificationReceiverDTO.setUserId( notificationReceiverUpdateRequestVO.getUserId() );
        notificationReceiverDTO.setDeviceId( notificationReceiverUpdateRequestVO.getDeviceId() );
        notificationReceiverDTO.setOrganizationId( notificationReceiverUpdateRequestVO.getOrganizationId() );
        notificationReceiverDTO.setCreatedAt( notificationReceiverUpdateRequestVO.getCreatedAt() );
        notificationReceiverDTO.setUpdatedAt( notificationReceiverUpdateRequestVO.getUpdatedAt() );

        return notificationReceiverDTO;
    }

    @Override
    public NotificationReceiverResponseVO toNotificationReceiverResponse(NotificationReceiver notificationReceiver) {
        if ( notificationReceiver == null ) {
            return null;
        }

        NotificationReceiverResponseVO notificationReceiverResponseVO = new NotificationReceiverResponseVO();

        notificationReceiverResponseVO.setId( notificationReceiver.getId() );
        notificationReceiverResponseVO.setNotificationId( notificationReceiver.getNotificationId() );
        notificationReceiverResponseVO.setUserId( notificationReceiver.getUserId() );
        notificationReceiverResponseVO.setDeviceId( notificationReceiver.getDeviceId() );
        notificationReceiverResponseVO.setOrganizationId( notificationReceiver.getOrganizationId() );
        notificationReceiverResponseVO.setCreatedAt( notificationReceiver.getCreatedAt() );
        notificationReceiverResponseVO.setUpdatedAt( notificationReceiver.getUpdatedAt() );
        notificationReceiverResponseVO.setDeletedAt( notificationReceiver.getDeletedAt() );

        return notificationReceiverResponseVO;
    }

    @Override
    public NotificationReceiverCreateResponseVO toNotificationReceiverCreateResponse(NotificationReceiver notificationReceiver) {
        if ( notificationReceiver == null ) {
            return null;
        }

        NotificationReceiverCreateResponseVO notificationReceiverCreateResponseVO = new NotificationReceiverCreateResponseVO();

        notificationReceiverCreateResponseVO.setId( notificationReceiver.getId() );
        notificationReceiverCreateResponseVO.setNotificationId( notificationReceiver.getNotificationId() );
        notificationReceiverCreateResponseVO.setUserId( notificationReceiver.getUserId() );
        notificationReceiverCreateResponseVO.setDeviceId( notificationReceiver.getDeviceId() );
        notificationReceiverCreateResponseVO.setOrganizationId( notificationReceiver.getOrganizationId() );
        notificationReceiverCreateResponseVO.setCreatedAt( notificationReceiver.getCreatedAt() );

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
