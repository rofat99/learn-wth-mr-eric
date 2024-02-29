package com.pm.eric.learning.controllers;

import com.pm.eric.learning.mappers.OrganizationVOMapper;
import com.pm.eric.learning.models.dto.OrganizationDTO;
import com.pm.eric.learning.models.entity.Organization;
import com.pm.eric.learning.services.OrganizationService;
import com.pm.eric.learning.vo.organization.OrganizationCreateRequestVO;
import com.pm.eric.learning.vo.organization.OrganizationCreateResponseVO;
import com.pm.eric.learning.vo.organization.OrganizationResponseVO;
import com.pm.eric.learning.vo.organization.OrganizationUpdateRequestVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Organization")
@RestController
@RequestMapping("/v1/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;
    @Autowired
    private OrganizationVOMapper organizationVOMapper;
    @Operation(summary = "Create organization")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = OrganizationCreateResponseVO.class))
            ),
    })
    @PostMapping
    public ResponseEntity<OrganizationCreateResponseVO> create(@RequestBody OrganizationCreateRequestVO organizationCreateRequestVO){
        OrganizationDTO organizationDTO = organizationVOMapper.from(organizationCreateRequestVO);
        Organization organization = organizationService.create(organizationDTO);
        OrganizationCreateResponseVO vo = organizationVOMapper.toOrganizationCreateResponse(organization);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }
    @Operation(summary = "Get organization by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = OrganizationResponseVO.class))
            ),
    })
    @GetMapping("{id}")
    public ResponseEntity<OrganizationResponseVO> get(@PathVariable Long id){
        Organization organization = organizationService.get(id);
        OrganizationResponseVO vo = organizationVOMapper.toOrganizationResponse(organization);
        return new ResponseEntity<>(vo,HttpStatus.FOUND);
    }
    @Operation(summary = "Get all organization")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",array = @ArraySchema(schema = @Schema(implementation = OrganizationResponseVO.class)))
            ),
    })
    @GetMapping()
    public ResponseEntity<List<OrganizationResponseVO>> getList(){
        List<Organization> organizationList = organizationService.getList();
        List<OrganizationResponseVO> voList = organizationVOMapper.toOrganizationResponseList(organizationList);
        return new ResponseEntity<>(voList,HttpStatus.FOUND);
    }
    @Operation(summary = "Update organization by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = OrganizationResponseVO.class))
            ),
    })
    @PatchMapping("{id}")
    public ResponseEntity<OrganizationResponseVO> update(@PathVariable Long id, @RequestBody OrganizationUpdateRequestVO organizationUpdateRequestVO) {
        OrganizationDTO organizationDTO = organizationVOMapper.fromUpdate(organizationUpdateRequestVO);
        Organization organization = organizationService.update(id,organizationDTO);
        OrganizationResponseVO vo = organizationVOMapper.toOrganizationResponse(organization);
        return new ResponseEntity<>(vo,HttpStatus.OK);
    }
    @Operation(summary = "Delete organization by ID")
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = organizationService.delete(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}

