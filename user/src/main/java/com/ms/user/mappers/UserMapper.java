package com.ms.user.mappers;

import com.ms.user.controllers.dtos.UserRequestDTO;
import com.ms.user.controllers.dtos.UserResponseDTO;
import com.ms.user.models.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserModel toEntity(UserRequestDTO dto) {
        UserModel user = new UserModel();
        user.setName(dto.name());
        user.setEmail(dto.email());

        return user;
    }

    public UserResponseDTO toDTO(UserModel user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}
