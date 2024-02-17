package com.pm.eric.learning.organization.mappers;

import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.models.entity.Organization;
import com.pm.eric.learning.organization.vo.OrganizationCreateRequestVO;
import com.pm.eric.learning.organization.vo.OrganizationCreateResponseVO;
import com.pm.eric.learning.organization.vo.OrganizationResponseVO;
import com.pm.eric.learning.organization.vo.OrganizationUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrganizationVOMapper {
    OrganizationVOMapper INSTANCE = Mappers.getMapper(OrganizationVOMapper.class);
    OrganizationDTO from(OrganizationCreateRequestVO organizationCreateRequestVO);
    OrganizationDTO fromUpdate(OrganizationUpdateRequestVO organizationUpdateRequestVO);
    OrganizationCreateResponseVO toOrganizationCreateResponse(Organization organization);
    OrganizationResponseVO toOrganizationResponse(Organization organization);
    List<OrganizationResponseVO> toOrganizationResponseList(List<Organization> organizationList);
}
