package com.pm.eric.learning.notification.vo.notification;

import lombok.Data;

import java.sql.Date;

@Data
public class NotificationResponseVO {
    private Long id;
    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
}
