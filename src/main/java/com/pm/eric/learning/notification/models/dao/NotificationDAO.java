package com.pm.eric.learning.notification.models.dao;

import com.pm.eric.learning.notification.models.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationDAO extends JpaRepository<Notification,Long> {
}
