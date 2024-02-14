package com.pm.eric.learning.role.vo;
import lombok.Data;

import java.sql.Date;

@Data
public class RoleResponseVO {
    private Long id;

    private String name;

    private String description;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
}
