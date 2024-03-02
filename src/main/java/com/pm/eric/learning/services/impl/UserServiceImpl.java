package com.pm.eric.learning.services.impl;

import com.pm.eric.learning.mappers.UserMapper;
import com.pm.eric.learning.models.entity.User;
import com.pm.eric.learning.models.repository.UserRepository;
import com.pm.eric.learning.models.dto.UserDTO;
import com.pm.eric.learning.services.UserService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
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
        return userRepository.findAll();
    }

    @Override
    public User update(Long id, UserDTO userDTO) throws BadRequestException {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent())
        {
            User user = optionalUser.get();
            userMapper.updateTargetFromSource(userDTO,user);
            return userRepository.save(user);
        } else{
             throw new BadRequestException("User is not exist");
        }
    }

    @Override
    public String delete(Long id) throws BadRequestException {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent())
        {
            try {
                User user = optionalUser.get();
                user.setDeletedAt(LocalDateTime.now());
                userRepository.save(user);
                return "success";
            } catch (Exception e) {
                throw new BadRequestException(e);
            }
        } else{
            throw new BadRequestException("User is not exist");
        }
    }
}
