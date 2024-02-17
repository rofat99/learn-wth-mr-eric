package com.pm.eric.learning.user.models.dto;

import com.pm.eric.learning.user.types.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
