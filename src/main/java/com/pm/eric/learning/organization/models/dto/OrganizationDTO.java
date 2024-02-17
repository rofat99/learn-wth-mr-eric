package com.pm.eric.learning.organization.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrganizationDTO {
        private Long id;

        private String name;

        private String abbrName;

        private String description;

        private LocalDateTime createdAt;

        private LocalDateTime updatedAt;

        private LocalDateTime deletedAt;
}
