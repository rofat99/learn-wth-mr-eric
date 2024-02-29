package com.pm.eric.learning.vo.event;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EventCreateRequestVO {

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "description is required")
    private String description;

    @NotNull(message = "startDate is required")
    private LocalDateTime startDate;

    @NotNull(message = "endDate is required")
    private LocalDateTime endDate;

    @NotNull(message = "userId is required")
    private Long userId;

    @NotNull(message = "organizationId is required")
    private Long organizationId;

}
