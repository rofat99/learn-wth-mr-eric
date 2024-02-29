package com.pm.eric.learning.mappers;

import com.pm.eric.learning.models.dto.NotificationDTO;
import com.pm.eric.learning.models.entity.Notification;
import com.pm.eric.learning.vo.notification.NotificationCreateRequestVO;
import com.pm.eric.learning.vo.notification.NotificationCreateResponseVO;
import com.pm.eric.learning.vo.notification.NotificationResponseVO;
import com.pm.eric.learning.vo.notification.NotificationUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationVOMapper {
    NotificationVOMapper INSTANCE = Mappers.getMapper(NotificationVOMapper.class);

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    NotificationDTO from(NotificationCreateRequestVO notificationCreateRequestVO);
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    NotificationDTO fromUpdate(NotificationUpdateRequestVO notificationUpdateRequestVO);
    NotificationCreateResponseVO toNotificationCreateResponse(Notification notification);
    NotificationResponseVO toNotificationResponse(Notification notification);
    List<NotificationResponseVO> toNotificationResponse(List<Notification> notificationList);
}
