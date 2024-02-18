package com.pm.eric.learning.event.mappers;

import com.pm.eric.learning.event.models.dto.EventDTO;
import com.pm.eric.learning.event.models.entity.Event;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T14:24:27+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public Event from(EventDTO eventDTO) {
        if ( eventDTO == null ) {
            return null;
        }

        Event event = new Event();

        event.setName( eventDTO.getName() );
        event.setDescription( eventDTO.getDescription() );
        event.setStartDate( eventDTO.getStartDate() );
        event.setEndDate( eventDTO.getEndDate() );
        event.setUserId( eventDTO.getUserId() );
        event.setOrganizationId( eventDTO.getOrganizationId() );

        return event;
    }

    @Override
    public void updateFromSourceToTarget(EventDTO source, Event event) {
        if ( source == null ) {
            return;
        }

        event.setId( source.getId() );
        event.setName( source.getName() );
        event.setDescription( source.getDescription() );
        event.setStartDate( source.getStartDate() );
        event.setEndDate( source.getEndDate() );
        event.setUserId( source.getUserId() );
        event.setOrganizationId( source.getOrganizationId() );
        event.setCreatedAt( source.getCreatedAt() );
        event.setUpdatedAt( source.getUpdatedAt() );
        event.setDeletedAt( source.getDeletedAt() );
    }
}
