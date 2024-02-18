package com.pm.eric.learning.organization.mappers;

import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.models.entity.Organization;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-17T21:51:21+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class OrganizationMapperImpl implements OrganizationMapper {

    @Override
    public Organization from(OrganizationDTO organizationDTO) {
        if ( organizationDTO == null ) {
            return null;
        }

        Organization organization = new Organization();

        organization.setAbbrName( organizationDTO.getAbbrName() );
        organization.setDescription( organizationDTO.getDescription() );
        organization.setName( organizationDTO.getName() );

        return organization;
    }

    @Override
    public void updateFromSourceToTarget(OrganizationDTO organizationDTO, Organization organization) {
        if ( organizationDTO == null ) {
            return;
        }

        organization.setAbbrName( organizationDTO.getAbbrName() );
        organization.setDescription( organizationDTO.getDescription() );
        organization.setName( organizationDTO.getName() );
    }
}
