package com.pm.eric.learning.organization.vo;

import lombok.Data;

import java.sql.Date;

@Data
public class OrganizationResponseVO {
    private Long id;

    private String name;

    private String abbrName;

    private String description;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
}
