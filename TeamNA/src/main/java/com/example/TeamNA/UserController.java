package com.example.TeamNA;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;
    @Autowired
    BlogPostRepo blogRepo;

    @GetMapping("/")
    public String mainPage () {
        return "mainPage";
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = new ArrayList<>();
        model.addAttribute("users", users);
        return "users";
    }



    @GetMapping("/createUser")
    public String create(Model model, User user) {
        model.addAttribute("user", user);
        return "createUser";
    }



    @DeleteMapping("/{username}")
    public User delete (@PathVariable String username) {
        userRepo.deleteUser(username);
        return null;
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
