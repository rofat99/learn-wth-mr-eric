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
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ORGANIZATION")
public class Organization extends Audit {

    @Column(name = "name")
    private String name;

    @Column(name = "abbr_name")
    private String abbrName;

    @Column(name = "description")
    private String description;

}
