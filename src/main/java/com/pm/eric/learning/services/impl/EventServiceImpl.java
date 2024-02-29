package com.pm.eric.learning.services.impl;

import com.pm.eric.learning.mappers.EventMapper;
import com.pm.eric.learning.models.repository.EventRepository;
import com.pm.eric.learning.models.dto.EventDTO;
import com.pm.eric.learning.models.entity.Event;
import com.pm.eric.learning.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private EventMapper eventMapper;

    @Override
    public Event create(EventDTO eventDTO) {
        Event event = eventMapper.from(eventDTO);
        return eventRepository.save(event);
    }

    @Override
    public Event get(Long id) {
        return eventRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Event> getList() {
        return eventRepository.findAll();
    }

    @Override
    public Event update(Long id, EventDTO eventDTO) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            Event event = optionalEvent.get();
            eventMapper.updateFromSourceToTarget(eventDTO, event);
            return eventRepository.save(event);
        }else {
            throw new RuntimeException("Event is not exist");
        }
    }

    @Override
    public String delete(Long id) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            try{
                Event event = optionalEvent.get();
                event.setDeletedAt(LocalDateTime.now());
                eventRepository.save(event);
                return "success";
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }else {
            throw new RuntimeException("Event is not exist");
        }
    }
}
