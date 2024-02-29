package com.pm.eric.learning.controllers;

import com.pm.eric.learning.mappers.RoleVOMapper;
import com.pm.eric.learning.models.dto.RoleDTO;
import com.pm.eric.learning.models.entity.Role;
import com.pm.eric.learning.services.RoleService;
import com.pm.eric.learning.vo.role.RoleCreateRequestVO;
import com.pm.eric.learning.vo.role.RoleCreateResponseVO;
import com.pm.eric.learning.vo.role.RoleResponseVO;
import com.pm.eric.learning.vo.role.RoleUpdateRequestVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Role")
@RestController
@RequestMapping("/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleVOMapper roleVOMapper;

    @Operation(summary = "Create role")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = RoleCreateResponseVO.class))
            ),
    })
    @PostMapping
    public ResponseEntity<RoleCreateResponseVO> create(@RequestBody RoleCreateRequestVO roleCreateRequestVO){
        RoleDTO roleDTO = roleVOMapper.from(roleCreateRequestVO);
        Role role = roleService.create(roleDTO);
        RoleCreateResponseVO vo = roleVOMapper.toRoleCreateResponse(role);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }
    @Operation(summary = "Get role by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = RoleResponseVO.class))
            ),
    })
    @GetMapping("{id}")
    public ResponseEntity<RoleResponseVO> get(@PathVariable Long id){

        Role role = roleService.get(id);
        RoleResponseVO vo = roleVOMapper.toRoleResponse(role);
        return new ResponseEntity<>(vo, HttpStatus.FOUND);
    }
    @Operation(summary = "Get all role")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",array = @ArraySchema(schema = @Schema(implementation = RoleResponseVO.class)))
            ),
    })
    @GetMapping()
    public ResponseEntity<List<RoleResponseVO>> list(){
        List<Role> roleList = roleService.getList();
        List<RoleResponseVO> responseList = roleVOMapper.toRoleResponseList(roleList);
        return new ResponseEntity<>(responseList, HttpStatus.FOUND);
    }
    @Operation(summary = "Update role by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = RoleResponseVO.class))
            ),
    })
    @PatchMapping("{id}")
    public ResponseEntity<RoleResponseVO> update(@PathVariable Long id, @RequestBody RoleUpdateRequestVO roleUpdateRequestVO){
        RoleDTO roleDTO = roleVOMapper.fromUpdate(roleUpdateRequestVO);
        Role role = roleService.update(id,roleDTO);
        RoleResponseVO vo = roleVOMapper.toRoleResponse(role);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    @Operation(summary = "Delete role by ID")
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = roleService.delete(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
