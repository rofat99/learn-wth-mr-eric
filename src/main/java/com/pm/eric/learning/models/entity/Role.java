package com.pm.eric.learning.models.entity;

import com.pm.eric.learning.core.classes.Audit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "ROLE")
public class Role extends Audit {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
