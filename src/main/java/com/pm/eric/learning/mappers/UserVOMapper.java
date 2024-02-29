package com.pm.eric.learning.mappers;

import com.pm.eric.learning.models.dto.UserDTO;
import com.pm.eric.learning.models.entity.User;
import com.pm.eric.learning.vo.user.UserCreateRequestVO;
import com.pm.eric.learning.vo.user.UserCreateResponseVO;
import com.pm.eric.learning.vo.user.UserResponseVO;
import com.pm.eric.learning.vo.user.UserUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserVOMapper {
    UserVOMapper INSTANCE = Mappers.getMapper(UserVOMapper.class);
    UserDTO fromVO(UserCreateRequestVO userCreateRequestVO);
    UserDTO fromUpdateVO(UserUpdateRequestVO userUpdateRequestVO);
    UserCreateResponseVO toUserCreateResponse(User user);
    UserResponseVO toUserResponse(User user);

    List<UserResponseVO> toUserResponseList(List<User> users);
}
