package com.pm.eric.learning.role.mappers;

import com.pm.eric.learning.role.models.dto.RoleDTO;
import com.pm.eric.learning.role.models.entity.Role;
import com.pm.eric.learning.role.vo.RoleCreateRequestVO;
import com.pm.eric.learning.role.vo.RoleCreateResponseVO;
import com.pm.eric.learning.role.vo.RoleResponseVO;
import com.pm.eric.learning.role.vo.RoleUpdateRequestVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T21:51:21+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class RoleVOMapperImpl implements RoleVOMapper {

    @Override
    public RoleDTO from(RoleCreateRequestVO roleCreateRequestVO) {
        if ( roleCreateRequestVO == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        return roleDTO;
    }

    @Override
    public RoleDTO fromUpdate(RoleUpdateRequestVO roleUpdateRequestVO) {
        if ( roleUpdateRequestVO == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setDescription( roleUpdateRequestVO.getDescription() );
        roleDTO.setName( roleUpdateRequestVO.getName() );

        return roleDTO;
    }

    @Override
    public RoleCreateResponseVO toRoleCreateResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleCreateResponseVO roleCreateResponseVO = new RoleCreateResponseVO();

        roleCreateResponseVO.setCreatedAt( role.getCreatedAt() );
        roleCreateResponseVO.setDescription( role.getDescription() );
        roleCreateResponseVO.setId( role.getId() );
        roleCreateResponseVO.setName( role.getName() );

        return roleCreateResponseVO;
    }

    @Override
    public RoleResponseVO toRoleResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleResponseVO roleResponseVO = new RoleResponseVO();

        return roleResponseVO;
    }

    @Override
    public List<RoleResponseVO> toRoleResponseList(List<Role> roleList) {
        if ( roleList == null ) {
            return null;
        }

        List<RoleResponseVO> list = new ArrayList<RoleResponseVO>( roleList.size() );
        for ( Role role : roleList ) {
            list.add( toRoleResponse( role ) );
        }

        return list;
    }
}
