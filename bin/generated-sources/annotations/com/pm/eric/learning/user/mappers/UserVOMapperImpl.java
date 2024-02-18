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
    date = "2024-02-17T21:51:20+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class UserVOMapperImpl implements UserVOMapper {

    @Override
    public UserDTO fromVO(UserCreateRequestVO userCreateRequestVO) {
        if ( userCreateRequestVO == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        return userDTO;
    }

    @Override
    public UserDTO fromUpdateVO(UserUpdateRequestVO userUpdateRequestVO) {
        if ( userUpdateRequestVO == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        return userDTO;
    }

    @Override
    public UserCreateResponseVO toUserCreateResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserCreateResponseVO userCreateResponseVO = new UserCreateResponseVO();

        return userCreateResponseVO;
    }

    @Override
    public UserResponseVO toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseVO userResponseVO = new UserResponseVO();

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
