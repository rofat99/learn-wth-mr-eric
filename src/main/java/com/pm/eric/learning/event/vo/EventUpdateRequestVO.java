package com.pm.eric.learning.event.vo;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EventUpdateRequestVO {

    private String name;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long userId;

    private Long organizationId;

}
