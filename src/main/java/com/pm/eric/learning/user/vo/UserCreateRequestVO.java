package com.pm.eric.learning.user.vo;

import com.pm.eric.learning.user.types.GenderType;
import lombok.Data;

import java.sql.Date;
@Data
public class UserCreateRequestVO {

    private String fullName;

    private GenderType gender;

    private Date dateOfBirth;

    private String placeOfBirth;

    private String email;

    private String phoneNumber;

    private String currentAddress;

    private Long organizationId;
}
