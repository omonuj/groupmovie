package com.movie.controller;



import com.movie.dto.CreateUserRequest;
import com.movie.dto.LoginRequest;
import com.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/user")
//@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register/")
    public ResponseEntity<?> register(CreateUserRequest request) {
        try{
            var response = userService.createUser(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> getLoginPage(LoginRequest request){
       try{
           var response = userService.login(request);
           return ResponseEntity.status(HttpStatus.OK).body(response);
       }catch (Exception e) {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
       }
    }


}
