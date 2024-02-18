package com.pm.eric.learning.notification.models.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {

    private Long id;

    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
