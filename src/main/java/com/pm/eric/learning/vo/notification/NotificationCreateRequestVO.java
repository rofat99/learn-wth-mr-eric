package com.pm.eric.learning.vo.notification;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
public class NotificationCreateRequestVO {
    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "description is required")
    private String description;

    @NotNull(message = "eventId is required")
    private Long eventId;

    @NotNull(message = "organizationId is required")
    private Long organizationId;

}
