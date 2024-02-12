package com.pm.eric.learning.user.services;

import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;

import java.util.List;

public interface UserService {
    User create(UserDTO userDTO);
    User get(Long id);
    List<User> getList();
    User update(Long id, UserDTO userDTO);
    String delete(Long id);
}
