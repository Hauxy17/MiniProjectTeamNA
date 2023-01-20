package com.example.TeamNA;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserRepo {

    private List<User> users;

    public UserRepo() {
        users = new ArrayList<>();
        users.add(new User("Ella", "AW", "ella@brights.dk", "Hauxy", "1234"));
        users.add(new User("Line", "AW", "line@brights.dk", "Line", "1234"));
        users.add(new User("Sion", "AW", "sion@brights.dk", "Johnny Loeve", "1234"));
    }

    // get one user
    public User getUser(String userName) {
        for (User user : users) {
            if (user.getUsername().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    // get all users
    public List<User> getUsers() {
        return users;
    }

    // add a user
    public User addBook(User user) {
        User lastBook = users.get(users.size()-1);
        user.setUsername(lastBook.getUsername()+1); // set an UserName on the new user, should be unique, will be done by the database in future exercises
        users.add(user);
        return user;
    }

    // edit a user
        public User editUser(User user) {
        User userToEdit = this.getUser(user.getUsername());
        if (userToEdit  != null) {
            userToEdit .setUsername(user.getUsername());
            userToEdit .setPassword(user.getPassword());
            userToEdit .setEmail(user.getEmail());
        }
        return user;
    }

    // delete a user
    public void deleteUser(String userName) {
        User userToDelete = this.getUser(userName);
        if (userToDelete != null) {
            users.remove(userToDelete);
        }
    }


}


