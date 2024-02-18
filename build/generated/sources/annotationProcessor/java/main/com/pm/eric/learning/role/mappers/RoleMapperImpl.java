package com.pm.eric.learning.role.mappers;

import com.pm.eric.learning.role.models.dto.RoleDTO;
import com.pm.eric.learning.role.models.entity.Role;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T14:24:27+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role from(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setName( roleDTO.getName() );
        role.setDescription( roleDTO.getDescription() );

        return role;
    }

    @Override
    public void updateTargetFromSource(RoleDTO source, Role target) {
        if ( source == null ) {
            return;
        }

        target.setName( source.getName() );
        target.setDescription( source.getDescription() );
    }
}
