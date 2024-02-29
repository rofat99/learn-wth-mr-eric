package com.pm.eric.learning.vo.event;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EventResponseVO {
    private Long id;

    private String name;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long userId;

    private Long organizationId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
