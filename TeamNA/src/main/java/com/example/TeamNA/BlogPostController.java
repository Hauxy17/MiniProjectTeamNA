package com.example.TeamNA;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogPostController {

    @GetMapping ("/blogpost")
    public String getBlogPost(Model model, BlogPost blogPost){
        model.addAttribute( "text", blogPost.getText());
        model.addAttribute("author", blogPost.getAuthor());
        return "/blogPost";
    }

    @PostMapping ("/blogpost")
    public String setBlogPost(@Valid Model model, BlogPost blogPost, BindingResult bindingResult, List blogPosts){
        if(bindingResult.hasErrors()){
            return "/blogPost";
        }
        model.addAttribute( "text", blogPost.getText());
        model.addAttribute("author", blogPost.getAuthor());

        blogPosts.add(blogPost);
        return "/forum";
    }


}
