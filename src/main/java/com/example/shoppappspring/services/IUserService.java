package com.example.shoppappspring.services;

import com.example.shoppappspring.dtos.UpdateUserDTO;
import com.example.shoppappspring.dtos.UserDTO;
import com.example.shoppappspring.exceptions.DataNotFoundException;
import com.example.shoppappspring.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password, Long roleId) throws Exception;
    User getUserDetailsFromToken(String token) throws Exception;
    User updateUser(Long userId, UpdateUserDTO updatedUserDTO) throws Exception;
}
