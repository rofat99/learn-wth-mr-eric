package com.pm.eric.learning.organization.mappers;

import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.models.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {
    OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    Organization from(OrganizationDTO organizationDTO);
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    void updateFromSourceToTarget(OrganizationDTO organizationDTO, @MappingTarget Organization organization);
}
