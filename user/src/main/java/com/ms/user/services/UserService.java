package com.ms.user.services;

import com.ms.user.controllers.dtos.UserRequestDTO;
import com.ms.user.controllers.dtos.UserResponseDTO;
import com.ms.user.mappers.UserMapper;
import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper mapper;

    @Transactional
    public UserResponseDTO saveUser(UserRequestDTO dto) {
        UserModel user = userRepository.save(mapper.toEntity(dto));
        return mapper.toDTO(user);
    }
}
