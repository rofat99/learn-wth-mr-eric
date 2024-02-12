package com.pm.eric.learning.event.models.dao;

import com.pm.eric.learning.event.models.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDAO extends JpaRepository<Event,Long> {
}
