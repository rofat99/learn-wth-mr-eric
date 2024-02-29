package com.pm.eric.learning.mappers;

import com.pm.eric.learning.models.dto.RoleDTO;
import com.pm.eric.learning.models.entity.Role;
import com.pm.eric.learning.vo.role.RoleCreateRequestVO;
import com.pm.eric.learning.vo.role.RoleCreateResponseVO;
import com.pm.eric.learning.vo.role.RoleResponseVO;
import com.pm.eric.learning.vo.role.RoleUpdateRequestVO;
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
