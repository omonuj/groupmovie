package com.movie.service;

import com.movie.data.model.User;

import com.movie.data.repository.UserRepository;
import com.movie.dto.CreateUserRequest;
import com.movie.dto.CreateUserResponse;
import com.movie.dto.LoginRequest;
import com.movie.dto.LoginResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private  UserRepository userRepository;


    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        User createNewUser = new User();
        createNewUser.setUserName(createUserRequest.getUserName());
        createNewUser.setPassword(createUserRequest.getPassword());
        createNewUser.setEmail(createUserRequest.getEmail());
        userRepository.save(createNewUser);

        CreateUserResponse createUserResponse = new CreateUserResponse();
        createUserResponse.setMessage("user created successfully");
        return createUserResponse;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findUserByEmail(request.getEmail())
                .orElseThrow(()-> new IllegalArgumentException("User Not Found"));
        if(!user.getPassword().equals(request.getPassword()))throw new IllegalArgumentException("Invalid Credentials");
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail(request.getEmail());
        loginRequest.setPassword(request.getPassword());
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setEmail(user.getEmail());
        loginResponse.setMessage("user logged in successfully");
        loginResponse.setUsername(user.getUserName());
        return loginResponse;
    }

}
