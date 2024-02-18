package com.pm.eric.learning.notification.vo.notification;

import lombok.*;

@Data
public class NotificationUpdateRequestVO {
    private Long id;

    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

}
