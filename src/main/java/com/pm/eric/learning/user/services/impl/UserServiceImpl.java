package com.pm.eric.learning.user.services.impl;

import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import com.pm.eric.learning.user.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User create(UserDTO userDTO) {
        return null;
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public List<User> getList() {
        return null;
    }

    @Override
    public User update(Long id, UserDTO userDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
