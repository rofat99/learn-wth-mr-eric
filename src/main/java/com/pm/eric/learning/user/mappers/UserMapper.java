package com.pm.eric.learning.user.mappers;

import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deleteAt",ignore = true)
    User from(UserDTO userDTO);
}
