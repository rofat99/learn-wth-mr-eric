package com.pm.eric.learning.vo.user;

import com.pm.eric.learning.types.GenderType;
import lombok.*;

import java.time.LocalDateTime;

@Data
public class UserCreateResponseVO {
    private Long id;

    private String username;

    private String fullName;

    private GenderType gender;

    private LocalDateTime dateOfBirth;

    private String placeOfBirth;

    private String email;

    private String phoneNumber;

    private String currentAddress;

    private Long organizationId;

    private LocalDateTime createdAt;
}
