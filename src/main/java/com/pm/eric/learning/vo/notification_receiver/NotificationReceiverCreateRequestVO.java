package com.pm.eric.learning.vo.notification_receiver;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
public class NotificationReceiverCreateRequestVO {
    @NotNull(message = "notificationId is required")
    private Long notificationId;

    @NotNull(message = "userId is required")
    private Long userId;

    @NotNull(message = "deviceId is required")
    private Long deviceId;

    @NotNull(message = "organizationId is required")
    private Long organizationId;

}
