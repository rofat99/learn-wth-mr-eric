package com.pm.eric.learning.user.mappers;

import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import com.pm.eric.learning.user.vo.UserCreateRequestVO;
import com.pm.eric.learning.user.vo.UserCreateResponseVO;
import com.pm.eric.learning.user.vo.UserResponseVO;
import com.pm.eric.learning.user.vo.UserUpdateRequestVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T15:33:57+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class UserVOMapperImpl implements UserVOMapper {

    @Override
    public UserDTO fromVO(UserCreateRequestVO userCreateRequestVO) {
        if ( userCreateRequestVO == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setFullName( userCreateRequestVO.getFullName() );
        userDTO.setGender( userCreateRequestVO.getGender() );
        userDTO.setDateOfBirth( userCreateRequestVO.getDateOfBirth() );
        userDTO.setPlaceOfBirth( userCreateRequestVO.getPlaceOfBirth() );
        userDTO.setEmail( userCreateRequestVO.getEmail() );
        userDTO.setPhoneNumber( userCreateRequestVO.getPhoneNumber() );
        userDTO.setCurrentAddress( userCreateRequestVO.getCurrentAddress() );
        userDTO.setOrganizationId( userCreateRequestVO.getOrganizationId() );

        return userDTO;
    }

    @Override
    public UserDTO fromUpdateVO(UserUpdateRequestVO userUpdateRequestVO) {
        if ( userUpdateRequestVO == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setFullName( userUpdateRequestVO.getFullName() );
        userDTO.setGender( userUpdateRequestVO.getGender() );
        userDTO.setDateOfBirth( userUpdateRequestVO.getDateOfBirth() );
        userDTO.setPlaceOfBirth( userUpdateRequestVO.getPlaceOfBirth() );
        userDTO.setEmail( userUpdateRequestVO.getEmail() );
        userDTO.setPhoneNumber( userUpdateRequestVO.getPhoneNumber() );
        userDTO.setCurrentAddress( userUpdateRequestVO.getCurrentAddress() );
        userDTO.setOrganizationId( userUpdateRequestVO.getOrganizationId() );

        return userDTO;
    }

    @Override
    public UserCreateResponseVO toUserCreateResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserCreateResponseVO userCreateResponseVO = new UserCreateResponseVO();

        userCreateResponseVO.setId( user.getId() );
        userCreateResponseVO.setFullName( user.getFullName() );
        userCreateResponseVO.setGender( user.getGender() );
        userCreateResponseVO.setDateOfBirth( user.getDateOfBirth() );
        userCreateResponseVO.setPlaceOfBirth( user.getPlaceOfBirth() );
        userCreateResponseVO.setEmail( user.getEmail() );
        userCreateResponseVO.setPhoneNumber( user.getPhoneNumber() );
        userCreateResponseVO.setCurrentAddress( user.getCurrentAddress() );
        userCreateResponseVO.setOrganizationId( user.getOrganizationId() );
        userCreateResponseVO.setCreatedAt( user.getCreatedAt() );

        return userCreateResponseVO;
    }

    @Override
    public UserResponseVO toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseVO userResponseVO = new UserResponseVO();

        userResponseVO.setId( user.getId() );
        userResponseVO.setFullName( user.getFullName() );
        userResponseVO.setGender( user.getGender() );
        userResponseVO.setDateOfBirth( user.getDateOfBirth() );
        userResponseVO.setPlaceOfBirth( user.getPlaceOfBirth() );
        userResponseVO.setEmail( user.getEmail() );
        userResponseVO.setPhoneNumber( user.getPhoneNumber() );
        userResponseVO.setCurrentAddress( user.getCurrentAddress() );
        userResponseVO.setOrganizationId( user.getOrganizationId() );
        userResponseVO.setCreatedAt( user.getCreatedAt() );
        userResponseVO.setUpdatedAt( user.getUpdatedAt() );
        userResponseVO.setDeletedAt( user.getDeletedAt() );

        return userResponseVO;
    }

    @Override
    public List<UserResponseVO> toUserResponseList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserResponseVO> list = new ArrayList<UserResponseVO>( users.size() );
        for ( User user : users ) {
            list.add( toUserResponse( user ) );
        }

        return list;
    }
}
