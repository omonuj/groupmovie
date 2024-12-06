package com.movie.service;

import com.movie.dto.CreateUserRequest;
import com.movie.dto.CreateUserResponse;
import com.movie.dto.LoginRequest;
import com.movie.dto.LoginResponse;

public interface UserService {
    CreateUserResponse createUser(CreateUserRequest createUserRequest);
    LoginResponse login(LoginRequest request);
}
