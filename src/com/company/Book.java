package com.company;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void outputBook(){
        System.out.println("Author: " + author + " Title: " + title);
    }
}

