package com.pm.eric.learning.event.services;

import com.pm.eric.learning.event.models.dto.EventDTO;
import com.pm.eric.learning.event.models.entity.Event;

import java.util.List;

public interface EventService {
    Event create(EventDTO eventDTO);
    Event get(Long id);
    List<Event> getList();
    Event update(Long id,EventDTO eventDTO);
    String delete(Long id);
}
