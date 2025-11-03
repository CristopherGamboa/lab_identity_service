package com.example.lab_identity_service.lab_identity_service.services.interfaces;

import com.example.lab_identity_service.lab_identity_service.dtos.UserRequestDTO;
import com.example.lab_identity_service.lab_identity_service.dtos.UserResponseDTO;

public interface IUserService {
    UserResponseDTO createUser(UserRequestDTO requestDTO);
    UserResponseDTO getUserById(Long userId);
    UserResponseDTO updateUser(Long userId, UserRequestDTO requestDTO);
    void deleteUser(Long userId);
}
