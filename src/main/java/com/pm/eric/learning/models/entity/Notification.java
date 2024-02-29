package com.pm.eric.learning.models.entity;

import com.pm.eric.learning.core.classes.Audit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "NOTIFICATION")
public class Notification extends Audit {
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "organization_id")
    private Long organizationId;
}
