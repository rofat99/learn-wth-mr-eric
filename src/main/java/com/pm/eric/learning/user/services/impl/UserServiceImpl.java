package com.pm.eric.learning.user.services.impl;

import com.pm.eric.learning.user.mappers.UserMapper;
import com.pm.eric.learning.user.models.dao.UserDAO;
import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import com.pm.eric.learning.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public User create(UserDTO userDTO) {
        User body = userMapper.from(userDTO);
        return userRepository.save(body);
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id).orElseThrow();
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
