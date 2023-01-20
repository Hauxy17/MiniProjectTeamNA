package com.example.TeamNA;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class BlogPostRepo {

    List<BlogPost> blogPosts = new ArrayList<>();

    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }
}
