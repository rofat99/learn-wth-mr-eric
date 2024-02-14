package com.pm.eric.learning.organization.services.impl;


import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.services.OrganizationService;
import com.pm.eric.learning.organization.models.entity.Organization;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrganizationServiceImpl implements OrganizationService {


    @Override
    public Organization create(OrganizationDTO organizationDTO) {
        return null;
    }

    @Override
    public Organization get(Long id) {
        return null;
    }

    @Override
    public List<Organization> getList() {
        return null;
    }

    @Override
    public Organization update(Long id, OrganizationDTO organizationDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
