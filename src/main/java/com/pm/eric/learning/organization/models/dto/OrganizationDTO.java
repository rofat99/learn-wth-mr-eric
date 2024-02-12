package com.pm.eric.learning.organization.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrganizationDTO {
        private Long id;
        private String name;
        private String abbrName;
        private String description;
}
