package com.aexample.joshua.demokotlinapp;

/**
 * Created by Inferno on 1/25/2018.
 */

public class BookJava {
    private String title;
    private Long isbn;
    public BookJava(String title, Long isbn) {
        this.title = title;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Long getIsbn() {
        return isbn;
    }
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }
}
