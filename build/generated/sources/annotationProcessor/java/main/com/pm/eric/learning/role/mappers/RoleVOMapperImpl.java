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
    date = "2024-02-18T15:22:47+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class RoleVOMapperImpl implements RoleVOMapper {

    @Override
    public RoleDTO from(RoleCreateRequestVO roleCreateRequestVO) {
        if ( roleCreateRequestVO == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setName( roleCreateRequestVO.getName() );
        roleDTO.setDescription( roleCreateRequestVO.getDescription() );

        return roleDTO;
    }

    @Override
    public RoleDTO fromUpdate(RoleUpdateRequestVO roleUpdateRequestVO) {
        if ( roleUpdateRequestVO == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setName( roleUpdateRequestVO.getName() );
        roleDTO.setDescription( roleUpdateRequestVO.getDescription() );

        return roleDTO;
    }

    @Override
    public RoleCreateResponseVO toRoleCreateResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleCreateResponseVO roleCreateResponseVO = new RoleCreateResponseVO();

        roleCreateResponseVO.setId( role.getId() );
        roleCreateResponseVO.setName( role.getName() );
        roleCreateResponseVO.setDescription( role.getDescription() );
        roleCreateResponseVO.setCreatedAt( role.getCreatedAt() );

        return roleCreateResponseVO;
    }

    @Override
    public RoleResponseVO toRoleResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleResponseVO roleResponseVO = new RoleResponseVO();

        roleResponseVO.setId( role.getId() );
        roleResponseVO.setName( role.getName() );
        roleResponseVO.setDescription( role.getDescription() );
        roleResponseVO.setCreatedAt( role.getCreatedAt() );
        roleResponseVO.setUpdatedAt( role.getUpdatedAt() );
        roleResponseVO.setDeletedAt( role.getDeletedAt() );

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
