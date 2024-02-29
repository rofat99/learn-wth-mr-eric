package com.pm.eric.learning.mappers;

import com.pm.eric.learning.models.dto.EventDTO;
import com.pm.eric.learning.models.entity.Event;
import com.pm.eric.learning.vo.event.EventCreateRequestVO;
import com.pm.eric.learning.vo.event.EventCreateResponseVO;
import com.pm.eric.learning.vo.event.EventResponseVO;
import com.pm.eric.learning.vo.event.EventUpdateRequestVO;
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
