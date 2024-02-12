package com.pm.eric.learning.organization.models.dao;

import com.pm.eric.learning.organization.models.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationDAO extends JpaRepository<Organization,Long> {


}
