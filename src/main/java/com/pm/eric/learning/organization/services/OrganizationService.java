package com.pm.eric.learning.organization.services;

import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.models.entity.Organization;

import java.util.List;

public interface OrganizationService {
    Organization create(OrganizationDTO organizationDTO);
    Organization get(Long id);
    List<Organization> getList();
    Organization update(Long id, OrganizationDTO organizationDTO);

    String delete(Long id);
}
