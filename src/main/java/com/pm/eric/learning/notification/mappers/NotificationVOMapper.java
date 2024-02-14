package com.pm.eric.learning.notification.mappers;

import com.pm.eric.learning.notification.models.dto.NotificationDTO;
import com.pm.eric.learning.notification.models.entity.Notification;
import com.pm.eric.learning.notification.vo.notification.NotificationCreateRequestVO;
import com.pm.eric.learning.notification.vo.notification.NotificationCreateResponseVO;
import com.pm.eric.learning.notification.vo.notification.NotificationResponseVO;
import com.pm.eric.learning.notification.vo.notification.NotificationUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NotificationVOMapper {
    NotificationVOMapper INSTANCE = Mappers.getMapper(NotificationVOMapper.class);
    NotificationDTO from(NotificationCreateRequestVO notificationCreateRequestVO);
    NotificationDTO fromUpdate(NotificationUpdateRequestVO notificationUpdateRequestVO);
    NotificationCreateResponseVO toNotificationCreateResponse(Notification notification);
    NotificationResponseVO toNotificationResponse(Notification notification);
    List<NotificationResponseVO> toNotificationResponse(List<Notification> notificationList);
}
