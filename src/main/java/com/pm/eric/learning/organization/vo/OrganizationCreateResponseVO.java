package com.pm.eric.learning.organization.vo;

import lombok.Data;

import java.sql.Date;

@Data
public class OrganizationCreateResponseVO {
    private Long id;

    private String name;

    private String abbrName;

    private String description;

    private Date createdAt;
}
