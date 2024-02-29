package com.pm.eric.learning.models.entity;

import com.pm.eric.learning.core.classes.Audit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "ROLE_PERMISSION")
public class RolePermission extends Audit {

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "permission_id")
    private String permissionId;

}
