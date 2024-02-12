package com.pm.eric.learning.event.contollers;

import com.pm.eric.learning.event.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/event")
public class EventController {
    @Autowired
    private EventService eventService;


}
