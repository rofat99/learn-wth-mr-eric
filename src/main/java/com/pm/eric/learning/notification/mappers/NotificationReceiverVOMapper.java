package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.notification.models.entity.Notification;
import com.pm.eric.learning.notification.models.entity.NotificationReceiver;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverCreateRequestVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverCreateResponseVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverResponseVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationReceiverVOMapper {
    NotificationReceiverVOMapper INSTANCE = Mappers.getMapper(NotificationReceiverVOMapper.class);

    NotificationReceiverDTO from(NotificationReceiverCreateRequestVO notificationReceiverCreateRequestVO);
    NotificationReceiverDTO fromUpdate(NotificationReceiverUpdateRequestVO notificationReceiverUpdateRequestVO);
    NotificationReceiverResponseVO toNotificationReceiverResponse(NotificationReceiver notificationReceiver);
    NotificationReceiverCreateResponseVO toNotificationReceiverCreateResponse(NotificationReceiver notificationReceiver);
    List<NotificationReceiverResponseVO> toNotificationReceiverListResponse(List<NotificationReceiver> notificationReceiverList);
}
