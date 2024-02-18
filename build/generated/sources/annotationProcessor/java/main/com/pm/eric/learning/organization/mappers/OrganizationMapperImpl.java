package com.pm.eric.learning.organization.mappers;

import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.models.entity.Organization;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T14:24:27+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class OrganizationMapperImpl implements OrganizationMapper {

    @Override
    public Organization from(OrganizationDTO organizationDTO) {
        if ( organizationDTO == null ) {
            return null;
        }

        Organization organization = new Organization();

        organization.setName( organizationDTO.getName() );
        organization.setAbbrName( organizationDTO.getAbbrName() );
        organization.setDescription( organizationDTO.getDescription() );

        return organization;
    }

    @Override
    public void updateFromSourceToTarget(OrganizationDTO organizationDTO, Organization organization) {
        if ( organizationDTO == null ) {
            return;
        }

        organization.setName( organizationDTO.getName() );
        organization.setAbbrName( organizationDTO.getAbbrName() );
        organization.setDescription( organizationDTO.getDescription() );
    }
}
