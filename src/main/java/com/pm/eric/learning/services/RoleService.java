package com.pm.eric.learning.services;
import com.pm.eric.learning.models.dto.RoleDTO;
import com.pm.eric.learning.models.entity.Role;
import java.util.List;

public interface RoleService {
    Role create(RoleDTO roleDTO);
    Role get(Long id);

    List<Role> getList();
    Role update(Long id, RoleDTO roleDTO);
    String delete(Long id);
}
