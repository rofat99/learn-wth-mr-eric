package com.pm.eric.learning.role.vo;
import lombok.Data;

import java.sql.Date;
@Data
public class RoleCreateResponseVO {
    private Long id;

    private String name;

    private String description;

    private Date createdAt;

}
