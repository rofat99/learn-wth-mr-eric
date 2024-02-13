package com.pm.eric.learning.role.controllers;

import com.pm.eric.learning.role.mappers.RoleVOMapper;
import com.pm.eric.learning.role.models.dto.RoleDTO;
import com.pm.eric.learning.role.models.entity.Role;
import com.pm.eric.learning.role.services.RoleService;
import com.pm.eric.learning.role.vo.RoleCreateRequestVO;
import com.pm.eric.learning.role.vo.RoleCreateResponseVO;
import com.pm.eric.learning.role.vo.RoleResponseVO;
import com.pm.eric.learning.role.vo.RoleUpdateRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleVOMapper roleVOMapper;

    @PostMapping
    public ResponseEntity<RoleCreateResponseVO> create(@RequestBody RoleCreateRequestVO roleCreateRequestVO){
        RoleDTO roleDTO = roleVOMapper.from(roleCreateRequestVO);
        Role role = roleService.create(roleDTO);
        RoleCreateResponseVO vo = roleVOMapper.toRoleCreateResponse(role);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<RoleResponseVO> get(@PathVariable Long id){

        Role role = roleService.get(id);
        RoleResponseVO vo = roleVOMapper.toRoleResponse(role);
        return new ResponseEntity<>(vo, HttpStatus.FOUND);
    }
    @GetMapping()
    public ResponseEntity<List<RoleResponseVO>> list(){
        List<Role> roleList = roleService.getList();
        List<RoleResponseVO> responseList = roleVOMapper.toRoleResponseList(roleList);
        return new ResponseEntity<>(responseList, HttpStatus.FOUND);
    }
    @PatchMapping("{id}")
    public ResponseEntity<RoleResponseVO> update(@PathVariable Long id, @RequestBody RoleUpdateRequestVO roleUpdateRequestVO){
        RoleDTO roleDTO = roleVOMapper.fromUpdate(roleUpdateRequestVO);
        Role role = roleService.update(id,roleDTO);
        RoleResponseVO vo = roleVOMapper.toRoleResponse(role);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = roleService.delete(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
