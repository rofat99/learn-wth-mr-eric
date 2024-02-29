package com.pm.eric.learning.vo.organization;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class OrganizationCreateRequestVO {
    @NotBlank(message = "name is required")
    private String name;
    @NotBlank(message = "abbrName is required")
    private String abbrName;
    @NotBlank(message = "description is required")
    private String description;
}
