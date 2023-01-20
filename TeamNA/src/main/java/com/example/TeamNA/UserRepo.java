package com.example.TeamNA;

import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class UserRepo {
    User user = new User();

    public void deleteBook(String username) {
        String userToDelete = user.getUsername();
        if (userToDelete != null) {
            // user.remove(userToDelete);    }}
        }
    }
}
