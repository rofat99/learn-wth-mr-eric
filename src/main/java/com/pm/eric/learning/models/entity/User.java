package com.pm.eric.learning.models.entity;

import com.pm.eric.learning.core.classes.Audit;
import com.pm.eric.learning.types.GenderType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "USER")
public class User extends Audit {

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "gender")
    private GenderType gender;

    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "current_address")
    private String currentAddress;

    @Column(name = "organization_id")
    private Long organizationId;

}
