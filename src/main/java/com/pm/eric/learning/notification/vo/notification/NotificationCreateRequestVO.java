package com.pm.eric.learning.notification.vo.notification;

import lombok.Data;

@Data
public class NotificationCreateRequestVO {

    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

}
