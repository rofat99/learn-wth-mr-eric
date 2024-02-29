package com.pm.eric.learning.models.repository;

import com.pm.eric.learning.models.entity.NotificationReceiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationReceiverRepository extends JpaRepository<NotificationReceiver,Long> {
}
