package com.pm.eric.learning.event.mappers;

import com.pm.eric.learning.event.models.dto.EventDTO;
import com.pm.eric.learning.event.models.entity.Event;
import com.pm.eric.learning.event.vo.EventCreateRequestVO;
import com.pm.eric.learning.event.vo.EventCreateResponseVO;
import com.pm.eric.learning.event.vo.EventResponseVO;
import com.pm.eric.learning.event.vo.EventUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventVOMapper {
    EventVOMapper INSTANCE = Mappers.getMapper(EventVOMapper.class);
    EventDTO from(EventCreateRequestVO eventCreateRequestVO);
    EventDTO fromUpdate(EventUpdateRequestVO eventUpdateRequestVO);
    EventCreateResponseVO toEventCreateResponse(Event event);
    EventResponseVO toEventResponse(Event event);
    List<EventResponseVO> toEventResponseList(List<Event> eventList);
}
