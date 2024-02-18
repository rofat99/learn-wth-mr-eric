package com.pm.eric.learning.role.vo;

import lombok.*;

import java.time.LocalDateTime;

@Data
public class RoleResponseVO {
    private Long id;

    private String name;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
