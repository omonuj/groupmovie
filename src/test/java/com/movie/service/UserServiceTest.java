package com.movie.service;

import com.movie.data.model.Movie;
import com.movie.data.repository.UserRepository;
import com.movie.dto.CreateUserRequest;
import com.movie.dto.CreateUserResponse;
import com.movie.dto.LoginRequest;
import com.movie.dto.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
//    @BeforeEach
//    public void setUp() {
//        userRepository.deleteAll();
//    }
    @Test
    public void testThatUserCanBeCreated(){
    CreateUserRequest createUserRequest = new CreateUserRequest();
    createUserRequest.setEmail("madguy@email.com");
    createUserRequest.setUserName("Testtse");
    createUserRequest.setPassword("password");

    CreateUserResponse response = userService.createUser(createUserRequest);
    assertNotNull(response);
    assertEquals("user created successfully", response.getMessage());
    }

    @Test
    public void testThatUserCanLogin(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setEmail("test@email.com");
        createUserRequest.setUserName("Test");
        createUserRequest.setPassword("password");

        CreateUserResponse response = userService.createUser(createUserRequest);

        LoginRequest request = new LoginRequest();
        request.setEmail("test@email.com");
        request.setPassword("password");
        LoginResponse loginResponse = userService.login(request);
        assertNotNull(response);
        assertEquals("user logged in successfully", loginResponse.getMessage());
    }


}