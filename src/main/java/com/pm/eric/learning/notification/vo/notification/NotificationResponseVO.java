package com.pm.eric.learning.notification.vo.notification;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationResponseVO {
    private Long id;

    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
