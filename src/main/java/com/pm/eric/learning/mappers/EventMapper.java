package com.pm.eric.learning.mappers;

import com.pm.eric.learning.models.dto.EventDTO;
import com.pm.eric.learning.models.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    Event from(EventDTO eventDTO);

    void updateFromSourceToTarget(EventDTO source, @MappingTarget Event event);
}
