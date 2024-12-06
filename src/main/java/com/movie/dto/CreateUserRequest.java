package com.movie.dto;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class CreateUserRequest {
    private String userName;
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String Password;
    private String email;
}
