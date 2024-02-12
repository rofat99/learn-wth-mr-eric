package com.pm.eric.learning.event.services.impl;

import com.pm.eric.learning.event.models.dto.EventDTO;
import com.pm.eric.learning.event.models.entity.Event;
import com.pm.eric.learning.event.services.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventServiceImpl implements EventService {
    @Override
    public Event create(EventDTO eventDTO) {
        return null;
    }

    @Override
    public Event get(Long id) {
        return null;
    }

    @Override
    public List<Event> getList() {
        return null;
    }

    @Override
    public Event update(Long id, EventDTO eventDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
