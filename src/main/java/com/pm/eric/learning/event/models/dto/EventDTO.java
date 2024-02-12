package com.pm.eric.learning.event.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    private Long id;

    private String name;

    private String description;

    private Date startDate;

    private Date endDate;

    private Long userId;

    private Long organizationId;
}
