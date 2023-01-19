package com.example.TeamNA;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class User {

    @Size(min = 4, max = 30)
    private String username;

    @Size(min = 8)
    private String password;

    @Email
    private String email;

    public User() {
    }
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

