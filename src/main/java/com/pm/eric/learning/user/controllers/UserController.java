package com.pm.eric.learning.user.controllers;

import com.pm.eric.learning.user.mappers.UserVOMapper;
import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import com.pm.eric.learning.user.services.UserService;
import com.pm.eric.learning.user.vo.UserCreateRequestVO;
import com.pm.eric.learning.user.vo.UserCreateResponseVO;
import com.pm.eric.learning.user.vo.UserResponseVO;
import com.pm.eric.learning.user.vo.UserUpdateRequestVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@Tag(name = "User")
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserVOMapper userVOMapper;

    @Operation(summary = "Create user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = UserCreateResponseVO.class))
            ),
    })
    @PostMapping
    public ResponseEntity<UserCreateResponseVO> create(@RequestBody UserCreateRequestVO userCreateRequestVO){
        UserDTO userDTO = userVOMapper.fromVO(userCreateRequestVO);
        User user = userService.create(userDTO);
        UserCreateResponseVO vo = userVOMapper.toUserCreateResponse(user);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }
    @Operation(summary = "Get user by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = UserResponseVO.class))
            ),
    })
    @GetMapping("{id}")
    public ResponseEntity<UserResponseVO> get(@PathVariable Long id){

        User user = userService.get(id);
        UserResponseVO vo = userVOMapper.toUserResponse(user);
        return new ResponseEntity<>(vo, HttpStatus.FOUND);
    }
    @Operation(summary = "Get all user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",array = @ArraySchema(schema = @Schema(implementation = UserResponseVO.class)))
            ),
    })
    @GetMapping()
    public ResponseEntity<List<UserResponseVO>> list(){
        List<User> userList = userService.getList();
        List<UserResponseVO> responseList = userVOMapper.toUserResponseList(userList);
        return new ResponseEntity<>(responseList, HttpStatus.FOUND);
    }
    @Operation(summary = "Update user by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = UserResponseVO.class))
            ),
    })
    @PatchMapping("{id}")
    public ResponseEntity<UserResponseVO> update(@PathVariable Long id, @RequestBody UserUpdateRequestVO userUpdateRequestVO) throws BadRequestException {
        UserDTO userDTO = userVOMapper.fromUpdateVO(userUpdateRequestVO);
        User user = userService.update(id,userDTO);
        UserResponseVO vo = userVOMapper.toUserResponse(user);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    @Operation(summary = "Delete user by ID")
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) throws BadRequestException {
        String res = userService.delete(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
