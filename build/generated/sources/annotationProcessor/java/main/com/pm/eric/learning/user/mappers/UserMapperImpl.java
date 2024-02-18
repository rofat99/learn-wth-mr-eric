package com.pm.eric.learning.user.mappers;

import com.pm.eric.learning.user.models.dto.UserDTO;
import com.pm.eric.learning.user.models.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-18T14:24:27+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User from(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setFullName( userDTO.getFullName() );
        user.setGender( userDTO.getGender() );
        user.setDateOfBirth( userDTO.getDateOfBirth() );
        user.setPlaceOfBirth( userDTO.getPlaceOfBirth() );
        user.setEmail( userDTO.getEmail() );
        user.setPhoneNumber( userDTO.getPhoneNumber() );
        user.setCurrentAddress( userDTO.getCurrentAddress() );
        user.setOrganizationId( userDTO.getOrganizationId() );

        return user;
    }

    @Override
    public void updateTargetFromSource(UserDTO source, User target) {
        if ( source == null ) {
            return;
        }

        target.setFullName( source.getFullName() );
        target.setGender( source.getGender() );
        target.setDateOfBirth( source.getDateOfBirth() );
        target.setPlaceOfBirth( source.getPlaceOfBirth() );
        target.setEmail( source.getEmail() );
        target.setPhoneNumber( source.getPhoneNumber() );
        target.setCurrentAddress( source.getCurrentAddress() );
        target.setOrganizationId( source.getOrganizationId() );
    }
}
