package com.pm.eric.learning.role.vo;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class RoleCreateRequestVO {
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "description is required")
    private String description;
}
