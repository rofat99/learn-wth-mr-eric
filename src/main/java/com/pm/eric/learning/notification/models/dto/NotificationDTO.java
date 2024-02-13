package com.pm.eric.learning.notification.models.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {
    private Long id;
    private String name;

    private String description;

    private Long eventId;

    private Long organizationId;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
}
