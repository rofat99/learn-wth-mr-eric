package com.pm.eric.learning.notification.models.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationReceiverDTO {

    private Long id;

    private Long notificationId;

    private Long userId;

    private Long deviceId;

    private Long organizationId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
