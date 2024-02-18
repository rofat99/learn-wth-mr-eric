package com.pm.eric.learning.notification.vo.notification_receiver;

import lombok.*;

import java.time.LocalDateTime;

@Data
public class NotificationReceiverCreateResponseVO {

    private Long id;

    private Long notificationId;

    private Long userId;

    private Long deviceId;

    private Long organizationId;

    private LocalDateTime createdAt;

}
