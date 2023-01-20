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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

