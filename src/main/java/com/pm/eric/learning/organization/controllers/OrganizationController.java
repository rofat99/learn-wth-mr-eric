package com.pm.eric.learning.organization.controllers;

import com.pm.eric.learning.organization.mappers.OrganizationVOMapper;
import com.pm.eric.learning.organization.models.dto.OrganizationDTO;
import com.pm.eric.learning.organization.models.entity.Organization;
import com.pm.eric.learning.organization.services.OrganizationService;
import com.pm.eric.learning.organization.vo.OrganizationCreateRequestVO;
import com.pm.eric.learning.organization.vo.OrganizationCreateResponseVO;
import com.pm.eric.learning.organization.vo.OrganizationResponseVO;
import com.pm.eric.learning.organization.vo.OrganizationUpdateRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private OrganizationVOMapper organizationVOMapper;

    @PostMapping
    public ResponseEntity<OrganizationCreateResponseVO> create(@RequestBody OrganizationCreateRequestVO organizationCreateRequestVO){
        OrganizationDTO organizationDTO = organizationVOMapper.from(organizationCreateRequestVO);
        Organization organization = organizationService.create(organizationDTO);
        OrganizationCreateResponseVO vo = organizationVOMapper.toOrganizationCreateResponse(organization);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<OrganizationResponseVO> get(@PathVariable Long id){
        Organization organization = organizationService.get(id);
        OrganizationResponseVO vo = organizationVOMapper.toOrganizationResponse(organization);
        return new ResponseEntity<>(vo,HttpStatus.FOUND);
    }
    @GetMapping()
    public ResponseEntity<List<OrganizationResponseVO>> getList(){
        List<Organization> organizationList = organizationService.getList();
        List<OrganizationResponseVO> voList = organizationVOMapper.toOrganizationResponseList(organizationList);
        return new ResponseEntity<>(voList,HttpStatus.FOUND);
    }
    @PatchMapping("{id}")
    public ResponseEntity<OrganizationResponseVO> update(@PathVariable Long id, @RequestBody OrganizationUpdateRequestVO organizationUpdateRequestVO) {
        OrganizationDTO organizationDTO = organizationVOMapper.fromUpdate(organizationUpdateRequestVO);
        Organization organization = organizationService.update(id,organizationDTO);
        OrganizationResponseVO vo = organizationVOMapper.toOrganizationResponse(organization);
        return new ResponseEntity<>(vo,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = organizationService.delete(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}

