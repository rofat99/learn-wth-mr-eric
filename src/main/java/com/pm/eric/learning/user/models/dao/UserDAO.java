package com.pm.eric.learning.user.models.dao;

import com.pm.eric.learning.user.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,Long> {
}
