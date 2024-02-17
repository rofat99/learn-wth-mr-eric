package com.pm.eric.learning.role.mappers;

import com.pm.eric.learning.role.models.dto.RoleDTO;
import com.pm.eric.learning.role.models.entity.Role;
import com.pm.eric.learning.role.vo.RoleCreateRequestVO;
import com.pm.eric.learning.role.vo.RoleCreateResponseVO;
import com.pm.eric.learning.role.vo.RoleResponseVO;
import com.pm.eric.learning.role.vo.RoleUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleVOMapper {
    RoleVOMapper INSTANCE = Mappers.getMapper(RoleVOMapper.class);
    RoleDTO from(RoleCreateRequestVO roleCreateRequestVO);
    RoleDTO fromUpdate(RoleUpdateRequestVO roleUpdateRequestVO);
    RoleCreateResponseVO toRoleCreateResponse(Role role);
    RoleResponseVO toRoleResponse(Role role);
    List<RoleResponseVO> toRoleResponseList(List<Role> roleList);
}
