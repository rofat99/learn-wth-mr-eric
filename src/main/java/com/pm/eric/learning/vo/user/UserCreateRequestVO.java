package com.pm.eric.learning.vo.user;

import com.pm.eric.learning.types.GenderType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDateTime;

@Data
public class UserCreateRequestVO {

    @NotBlank(message = "username is required")
    private String username;

    @NotBlank(message = "password is required")
    private String password;

    @NotBlank(message = "fullName is required")
    private String fullName;

    @NotBlank(message = "gender is required")
    private GenderType gender;

    @Past(message =  "dateOfBirth should be in the past")
    @NotBlank(message = "dateOfBirth is required")
    private LocalDateTime dateOfBirth;

    @NotBlank(message = "placeOfBirth is required")
    private String placeOfBirth;

    @NotBlank(message = "name is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "phoneNumber is required")
    private String phoneNumber;

    @NotBlank(message = "currentAddress is required")
    private String currentAddress;

    @NotNull(message = "currentAddress is required")
    private Long organizationId;
}
