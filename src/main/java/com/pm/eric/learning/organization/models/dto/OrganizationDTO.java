package com.pm.eric.learning.organization.models.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrganizationDTO {
        private Long id;

        private String name;

        private String abbrName;

        private String description;

        private Date createdAt;

        private Date updatedAt;

        private Date deletedAt;
}
