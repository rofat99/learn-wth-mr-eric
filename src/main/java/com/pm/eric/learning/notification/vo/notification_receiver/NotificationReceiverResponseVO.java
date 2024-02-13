package com.pm.eric.learning.notification.vo.notification_receiver;

import lombok.Data;

import java.sql.Date;

@Data
public class NotificationReceiverResponseVO {
    private Long id;

    private Long notificationId;

    private Long userId;

    private Long deviceId;

    private Long organizationId;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
}
