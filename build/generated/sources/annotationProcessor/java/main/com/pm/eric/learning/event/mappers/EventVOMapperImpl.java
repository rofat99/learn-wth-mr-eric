package com.pm.eric.learning.event.mappers;

import com.pm.eric.learning.event.models.dto.EventDTO;
import com.pm.eric.learning.event.models.entity.Event;
import com.pm.eric.learning.event.vo.EventCreateRequestVO;
import com.pm.eric.learning.event.vo.EventCreateResponseVO;
import com.pm.eric.learning.event.vo.EventResponseVO;
import com.pm.eric.learning.event.vo.EventUpdateRequestVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T15:22:47+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class EventVOMapperImpl implements EventVOMapper {

    @Override
    public EventDTO from(EventCreateRequestVO eventCreateRequestVO) {
        if ( eventCreateRequestVO == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setName( eventCreateRequestVO.getName() );
        eventDTO.setDescription( eventCreateRequestVO.getDescription() );
        eventDTO.setStartDate( eventCreateRequestVO.getStartDate() );
        eventDTO.setEndDate( eventCreateRequestVO.getEndDate() );
        eventDTO.setUserId( eventCreateRequestVO.getUserId() );
        eventDTO.setOrganizationId( eventCreateRequestVO.getOrganizationId() );

        return eventDTO;
    }

    @Override
    public EventDTO fromUpdate(EventUpdateRequestVO eventUpdateRequestVO) {
        if ( eventUpdateRequestVO == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setName( eventUpdateRequestVO.getName() );
        eventDTO.setDescription( eventUpdateRequestVO.getDescription() );
        eventDTO.setStartDate( eventUpdateRequestVO.getStartDate() );
        eventDTO.setEndDate( eventUpdateRequestVO.getEndDate() );
        eventDTO.setUserId( eventUpdateRequestVO.getUserId() );
        eventDTO.setOrganizationId( eventUpdateRequestVO.getOrganizationId() );

        return eventDTO;
    }

    @Override
    public EventCreateResponseVO toEventCreateResponse(Event event) {
        if ( event == null ) {
            return null;
        }

        EventCreateResponseVO eventCreateResponseVO = new EventCreateResponseVO();

        eventCreateResponseVO.setId( event.getId() );
        eventCreateResponseVO.setName( event.getName() );
        eventCreateResponseVO.setDescription( event.getDescription() );
        eventCreateResponseVO.setStartDate( event.getStartDate() );
        eventCreateResponseVO.setEndDate( event.getEndDate() );
        eventCreateResponseVO.setUserId( event.getUserId() );
        eventCreateResponseVO.setOrganizationId( event.getOrganizationId() );
        eventCreateResponseVO.setCreatedAt( event.getCreatedAt() );

        return eventCreateResponseVO;
    }

    @Override
    public EventResponseVO toEventResponse(Event event) {
        if ( event == null ) {
            return null;
        }

        EventResponseVO eventResponseVO = new EventResponseVO();

        eventResponseVO.setId( event.getId() );
        eventResponseVO.setName( event.getName() );
        eventResponseVO.setDescription( event.getDescription() );
        eventResponseVO.setStartDate( event.getStartDate() );
        eventResponseVO.setEndDate( event.getEndDate() );
        eventResponseVO.setUserId( event.getUserId() );
        eventResponseVO.setOrganizationId( event.getOrganizationId() );
        eventResponseVO.setCreatedAt( event.getCreatedAt() );
        eventResponseVO.setUpdatedAt( event.getUpdatedAt() );
        eventResponseVO.setDeletedAt( event.getDeletedAt() );

        return eventResponseVO;
    }

    @Override
    public List<EventResponseVO> toEventResponseList(List<Event> eventList) {
        if ( eventList == null ) {
            return null;
        }

        List<EventResponseVO> list = new ArrayList<EventResponseVO>( eventList.size() );
        for ( Event event : eventList ) {
            list.add( toEventResponse( event ) );
        }

        return list;
    }
}
