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
    date = "2024-02-18T15:22:47+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class OrganizationVOMapperImpl implements OrganizationVOMapper {

    @Override
    public OrganizationDTO from(OrganizationCreateRequestVO organizationCreateRequestVO) {
        if ( organizationCreateRequestVO == null ) {
            return null;
        }

        OrganizationDTO organizationDTO = new OrganizationDTO();

        organizationDTO.setName( organizationCreateRequestVO.getName() );
        organizationDTO.setAbbrName( organizationCreateRequestVO.getAbbrName() );
        organizationDTO.setDescription( organizationCreateRequestVO.getDescription() );

        return organizationDTO;
    }

    @Override
    public OrganizationDTO fromUpdate(OrganizationUpdateRequestVO organizationUpdateRequestVO) {
        if ( organizationUpdateRequestVO == null ) {
            return null;
        }

        OrganizationDTO organizationDTO = new OrganizationDTO();

        organizationDTO.setName( organizationUpdateRequestVO.getName() );
        organizationDTO.setAbbrName( organizationUpdateRequestVO.getAbbrName() );
        organizationDTO.setDescription( organizationUpdateRequestVO.getDescription() );

        return organizationDTO;
    }

    @Override
    public OrganizationCreateResponseVO toOrganizationCreateResponse(Organization organization) {
        if ( organization == null ) {
            return null;
        }

        OrganizationCreateResponseVO organizationCreateResponseVO = new OrganizationCreateResponseVO();

        organizationCreateResponseVO.setId( organization.getId() );
        organizationCreateResponseVO.setName( organization.getName() );
        organizationCreateResponseVO.setAbbrName( organization.getAbbrName() );
        organizationCreateResponseVO.setDescription( organization.getDescription() );
        organizationCreateResponseVO.setCreatedAt( organization.getCreatedAt() );

        return organizationCreateResponseVO;
    }

    @Override
    public OrganizationResponseVO toOrganizationResponse(Organization organization) {
        if ( organization == null ) {
            return null;
        }

        OrganizationResponseVO organizationResponseVO = new OrganizationResponseVO();

        organizationResponseVO.setId( organization.getId() );
        organizationResponseVO.setName( organization.getName() );
        organizationResponseVO.setAbbrName( organization.getAbbrName() );
        organizationResponseVO.setDescription( organization.getDescription() );
        organizationResponseVO.setCreatedAt( organization.getCreatedAt() );
        organizationResponseVO.setUpdatedAt( organization.getUpdatedAt() );
        organizationResponseVO.setDeletedAt( organization.getDeletedAt() );

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
