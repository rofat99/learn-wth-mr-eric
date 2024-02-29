package com.pm.eric.learning.vo.notification;

import lombok.*;

import java.time.LocalDateTime;

@Data
public class NotificationCreateResponseVO {
    private Long id;

    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

    private LocalDateTime createdAt;

}
