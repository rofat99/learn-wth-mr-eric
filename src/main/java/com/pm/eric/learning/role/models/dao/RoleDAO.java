package com.pm.eric.learning.role.models.dao;

import com.pm.eric.learning.role.models.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role,Long> {
}
