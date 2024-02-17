package com.pm.eric.learning.notification.vo.notification_receiver;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationReceiverResponseVO {
    private Long id;

    private Long notificationId;

    private Long userId;

    private Long deviceId;

    private Long organizationId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
