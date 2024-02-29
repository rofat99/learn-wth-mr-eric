package com.pm.eric.learning.mappers;

import com.pm.eric.learning.models.dto.OrganizationDTO;
import com.pm.eric.learning.models.entity.Organization;
import com.pm.eric.learning.vo.organization.OrganizationCreateRequestVO;
import com.pm.eric.learning.vo.organization.OrganizationCreateResponseVO;
import com.pm.eric.learning.vo.organization.OrganizationResponseVO;
import com.pm.eric.learning.vo.organization.OrganizationUpdateRequestVO;
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
