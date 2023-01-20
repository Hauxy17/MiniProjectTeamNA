package com.example.TeamNA;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class User {

    @Size(min = 1)
    private String firstName;

    @Size(min = 1)
    private String lastName;

    @Email
    private String email;

    @Size(min = 8)
    private String password;

    @Size(min = 4, max = 30)
    private String username;

    public User() {
    }
    public User(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
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

