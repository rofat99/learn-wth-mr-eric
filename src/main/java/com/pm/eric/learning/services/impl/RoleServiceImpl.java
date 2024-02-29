package com.pm.eric.learning.services.impl;

import com.pm.eric.learning.mappers.RoleMapper;
import com.pm.eric.learning.models.repository.RoleRepository;
import com.pm.eric.learning.models.dto.RoleDTO;
import com.pm.eric.learning.models.entity.Role;
import com.pm.eric.learning.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Role create(RoleDTO roleDTO) {
        Role role = roleMapper.from(roleDTO);
        return roleRepository.save(role);
    }

    @Override
    public Role get(Long id) {
        return roleRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Role> getList() {
        return roleRepository.findAll();
    }

    @Override
    public Role update(Long id, RoleDTO roleDTO) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if(optionalRole.isPresent())
        {
            try {
                Role role = optionalRole.get();
                roleMapper.updateTargetFromSource(roleDTO,role);
                return roleRepository.save(role);
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    @Override
    public String delete(Long id) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if(optionalRole.isPresent()){
            try{
                Role role = optionalRole.get();
                role.setDeletedAt(LocalDateTime.now());
                roleRepository.save(role);
                return "success";
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }
         else {
             throw new RuntimeException("Role is not exist");
        }
    }
}
