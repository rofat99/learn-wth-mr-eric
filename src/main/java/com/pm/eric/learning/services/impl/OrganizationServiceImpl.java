package com.pm.eric.learning.services.impl;


import com.pm.eric.learning.mappers.OrganizationMapper;
import com.pm.eric.learning.models.repository.OrganizationRepository;
import com.pm.eric.learning.models.dto.OrganizationDTO;
import com.pm.eric.learning.services.OrganizationService;
import com.pm.eric.learning.models.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;
    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public Organization create(OrganizationDTO organizationDTO) {
        Organization organization = organizationMapper.from(organizationDTO);
        return organizationRepository.save(organization);
    }

    @Override
    public Organization get(Long id) {
        return organizationRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Organization> getList() {
        return organizationRepository.findAll();
    }

    @Override
    public Organization update(Long id, OrganizationDTO organizationDTO) {
        Optional<Organization> optionalOrganization = organizationRepository.findById(id);
        if(optionalOrganization.isPresent())
        {
            Organization organization = optionalOrganization.get();
            organizationMapper.updateFromSourceToTarget(organizationDTO,organization);
            return organizationRepository.save(organization);
        } else {
            throw new RuntimeException("Organization is not exist");
        }
    }

    @Override
    public String delete(Long id) {
        Optional<Organization> optionalOrganization = organizationRepository.findById(id);
        if(optionalOrganization.isPresent()){
            try{
                Organization organization = optionalOrganization.get();
                organization.setDeletedAt(LocalDateTime.now());
                organizationRepository.save(organization);
                return "success";
            }   catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        else {
            throw new RuntimeException("Organization is not exist");
        }
    }
}

