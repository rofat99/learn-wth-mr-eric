package com.pm.eric.learning.services;

import com.pm.eric.learning.models.dto.OrganizationDTO;
import com.pm.eric.learning.models.entity.Organization;

import java.util.List;

public interface OrganizationService {
    Organization create(OrganizationDTO organizationDTO);
    Organization get(Long id);
    List<Organization> getList();
    Organization update(Long id, OrganizationDTO organizationDTO);

    String delete(Long id);
}
