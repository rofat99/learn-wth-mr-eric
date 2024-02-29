package com.pm.eric.learning.vo.organization;

import lombok.*;

import java.time.LocalDateTime;

@Data
public class OrganizationResponseVO {
    private Long id;

    private String name;

    private String abbrName;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
