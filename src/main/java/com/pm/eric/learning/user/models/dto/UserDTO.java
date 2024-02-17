package com.pm.eric.learning.user.models.dto;

import com.pm.eric.learning.user.types.GenderType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    private String fullName;

    private GenderType gender;

    private LocalDateTime dateOfBirth;

    private String placeOfBirth;

    private String email;

    private String phoneNumber;

    private String currentAddress;

    private Long organizationId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
