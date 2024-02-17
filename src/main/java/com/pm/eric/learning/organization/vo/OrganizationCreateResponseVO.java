package com.pm.eric.learning.organization.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrganizationCreateResponseVO {
    private Long id;

    private String name;

    private String abbrName;

    private String description;

    private LocalDateTime createdAt;
}
