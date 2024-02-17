package com.pm.eric.learning.user.services;

import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import org.apache.coyote.BadRequestException;

import java.util.List;

public interface UserService {
    User create(UserDTO userDTO);
    User get(Long id);
    List<User> getList();
    User update(Long id, UserDTO userDTO) throws BadRequestException;
    String delete(Long id) throws BadRequestException;
}
