package com.pm.eric.learning.notification.vo.notification;

import lombok.Data;

import java.sql.Date;

@Data
public class NotificationCreateResponseVO {
    private Long id;

    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

    private Date createdAt;

}
