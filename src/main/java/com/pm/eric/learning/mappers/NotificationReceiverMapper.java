package com.pm.eric.learning.mappers;

import com.pm.eric.learning.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.models.entity.NotificationReceiver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface NotificationReceiverMapper {
    NotificationReceiverMapper INSTANCE = Mappers.getMapper(NotificationReceiverMapper.class);

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    NotificationReceiver from(NotificationReceiverDTO notificationReceiverDTO);
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    void updateFromSourceToTarget(NotificationReceiverDTO notificationReceiverDTO , @MappingTarget NotificationReceiver notificationReceiver);

}
