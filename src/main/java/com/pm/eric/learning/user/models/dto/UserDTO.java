package com.pm.eric.learning.user.models.dto;

import com.pm.eric.learning.user.types.GenderType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String fullName;
    private GenderType gender;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String email;
    private String phoneNumber;
    private String currentAddress;
    private Long organizationId;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
