package com.pm.eric.learning.organization.mappers;

import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.models.entity.Organization;
import com.pm.eric.learning.organization.vo.OrganizationCreateRequestVO;
import com.pm.eric.learning.organization.vo.OrganizationCreateResponseVO;
import com.pm.eric.learning.organization.vo.OrganizationResponseVO;
import com.pm.eric.learning.organization.vo.OrganizationUpdateRequestVO;
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
public class OrganizationVOMapperImpl implements OrganizationVOMapper {

    @Override
    public OrganizationDTO from(OrganizationCreateRequestVO organizationCreateRequestVO) {
        if ( organizationCreateRequestVO == null ) {
            return null;
        }

        OrganizationDTO organizationDTO = new OrganizationDTO();

        organizationDTO.setAbbrName( organizationCreateRequestVO.getAbbrName() );
        organizationDTO.setDescription( organizationCreateRequestVO.getDescription() );
        organizationDTO.setName( organizationCreateRequestVO.getName() );

        return organizationDTO;
    }

    @Override
    public OrganizationDTO fromUpdate(OrganizationUpdateRequestVO organizationUpdateRequestVO) {
        if ( organizationUpdateRequestVO == null ) {
            return null;
        }

        OrganizationDTO organizationDTO = new OrganizationDTO();

        organizationDTO.setAbbrName( organizationUpdateRequestVO.getAbbrName() );
        organizationDTO.setDescription( organizationUpdateRequestVO.getDescription() );
        organizationDTO.setName( organizationUpdateRequestVO.getName() );

        return organizationDTO;
    }

    @Override
    public OrganizationCreateResponseVO toOrganizationCreateResponse(Organization organization) {
        if ( organization == null ) {
            return null;
        }

        OrganizationCreateResponseVO organizationCreateResponseVO = new OrganizationCreateResponseVO();

        organizationCreateResponseVO.setAbbrName( organization.getAbbrName() );
        organizationCreateResponseVO.setCreatedAt( organization.getCreatedAt() );
        organizationCreateResponseVO.setDescription( organization.getDescription() );
        organizationCreateResponseVO.setId( organization.getId() );
        organizationCreateResponseVO.setName( organization.getName() );

        return organizationCreateResponseVO;
    }

    @Override
    public OrganizationResponseVO toOrganizationResponse(Organization organization) {
        if ( organization == null ) {
            return null;
        }

        OrganizationResponseVO organizationResponseVO = new OrganizationResponseVO();

        organizationResponseVO.setAbbrName( organization.getAbbrName() );
        organizationResponseVO.setCreatedAt( organization.getCreatedAt() );
        organizationResponseVO.setDeletedAt( organization.getDeletedAt() );
        organizationResponseVO.setDescription( organization.getDescription() );
        organizationResponseVO.setId( organization.getId() );
        organizationResponseVO.setName( organization.getName() );
        organizationResponseVO.setUpdatedAt( organization.getUpdatedAt() );

        return organizationResponseVO;
    }

    @Override
    public List<OrganizationResponseVO> toOrganizationResponseList(List<Organization> organizationList) {
        if ( organizationList == null ) {
            return null;
        }

        List<OrganizationResponseVO> list = new ArrayList<OrganizationResponseVO>( organizationList.size() );
        for ( Organization organization : organizationList ) {
            list.add( toOrganizationResponse( organization ) );
        }

        return list;
    }
}
