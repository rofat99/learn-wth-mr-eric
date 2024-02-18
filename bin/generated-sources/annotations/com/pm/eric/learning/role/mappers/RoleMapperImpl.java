package com.pm.eric.learning.role.mappers;

import com.pm.eric.learning.role.models.dto.RoleDTO;
import com.pm.eric.learning.role.models.entity.Role;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T21:51:21+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role from(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setDescription( roleDTO.getDescription() );
        role.setName( roleDTO.getName() );

        return role;
    }

    @Override
    public void updateTargetFromSource(RoleDTO source, Role target) {
        if ( source == null ) {
            return;
        }

        target.setDescription( source.getDescription() );
        target.setName( source.getName() );
    }
}
