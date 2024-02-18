package com.pm.eric.learning.event.contollers;

import com.pm.eric.learning.event.mappers.EventVOMapper;
import com.pm.eric.learning.event.models.dto.EventDTO;
import com.pm.eric.learning.event.models.entity.Event;
import com.pm.eric.learning.event.services.EventService;
import com.pm.eric.learning.event.vo.EventCreateRequestVO;
import com.pm.eric.learning.event.vo.EventCreateResponseVO;
import com.pm.eric.learning.event.vo.EventResponseVO;
import com.pm.eric.learning.event.vo.EventUpdateRequestVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Event")
@RestController
@RequestMapping("v1/event")
public class EventController {
    @Autowired
    private EventService eventService;
    @Autowired
    private EventVOMapper eventVOMapper;

    @Operation(summary = "Create event")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = EventCreateResponseVO.class))
             ),
    })
    @PostMapping()
    public ResponseEntity<EventCreateResponseVO> create(@Valid @RequestBody EventCreateRequestVO eventCreateRequestVO){
        EventDTO eventDTO = eventVOMapper.from(eventCreateRequestVO);
        Event event = eventService.create(eventDTO);
        EventCreateResponseVO vo = eventVOMapper.toEventCreateResponse(event);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }

    @Operation(summary = "Get event by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = EventResponseVO.class))
            ),
    })
    @GetMapping("{id}")
    public ResponseEntity<EventResponseVO> get(@PathVariable Long id){
        Event event = eventService.get(id);
        EventResponseVO vo = eventVOMapper.toEventResponse(event);
        return new ResponseEntity<>(vo,HttpStatus.FOUND);
    }

    @Operation(summary = "Get all event")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",array = @ArraySchema(schema = @Schema(implementation = EventResponseVO.class)))
            ),
    })
    @GetMapping
    public ResponseEntity<List<EventResponseVO>> getList(){
        List<Event> eventList = eventService.getList();
        List<EventResponseVO> voList = eventVOMapper.toEventResponseList(eventList);
        return new ResponseEntity<>(voList, HttpStatus.FOUND);
    }

    @Operation(summary = "Update event by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = EventResponseVO.class))
            ),
    })
    @PatchMapping("{id}")
    public ResponseEntity<EventResponseVO> update(@PathVariable Long id, @RequestBody EventUpdateRequestVO eventUpdateRequestVO){
        EventDTO eventDTO = eventVOMapper.fromUpdate(eventUpdateRequestVO);
        Event event = eventService.update(id, eventDTO);
        EventResponseVO vo = eventVOMapper.toEventResponse(event);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    @Operation(summary = "Delete event by ID")
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = eventService.delete(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}


