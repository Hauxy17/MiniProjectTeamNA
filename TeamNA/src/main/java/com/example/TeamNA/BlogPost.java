package com.example.TeamNA;

import jakarta.validation.constraints.Size;

public class BlogPost {
    @Size(min=1,max=300)
    private String text;
    private String author;

    public BlogPost(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
