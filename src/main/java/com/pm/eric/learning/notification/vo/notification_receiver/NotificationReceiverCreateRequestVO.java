package com.pm.eric.learning.notification.vo.notification_receiver;

import lombok.Data;

@Data
public class NotificationReceiverCreateRequestVO {

    private Long notificationId;

    private Long userId;

    private Long deviceId;

    private Long organizationId;

}
