package com.example.TeamNA;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.security.config.http.MatcherType.mvc;

@Controller
public class UserController {

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
}
