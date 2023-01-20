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

    public List<BlogPost> addBlogPost(BlogPost blogPost, String author, String text) {
        blogPost.setAuthor(author);
        blogPost.setText(text);
        blogPosts.add(blogPost);
        return blogPosts;
    }

}
