package com.pm.eric.learning.user.mappers;

import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import com.pm.eric.learning.user.vo.UserCreateRequestVO;
import com.pm.eric.learning.user.vo.UserCreateResponseVO;
import com.pm.eric.learning.user.vo.UserResponseVO;
import com.pm.eric.learning.user.vo.UserUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserVOMapper {
    UserVOMapper INSTANCE = Mappers.getMapper(UserVOMapper.class);
    UserDTO fromVO(UserCreateRequestVO userCreateRequestVO);
    UserDTO fromUpdateVO(UserUpdateRequestVO userUpdateRequestVO);
    UserCreateResponseVO toUserCreateResponse(User user);
    UserResponseVO toUserResponse(User user);

    List<UserResponseVO> toUserResponseList(List<User> users);
}
