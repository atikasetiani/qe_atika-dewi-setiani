/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Object Oriented Programming
 * Praktikum Soal Eksplorasi
 * Class Book
 */
package book;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

class Book {
    UUID id;
    String title;
    private String author;
    private String category;
    
    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.category = category;
    }
    
    public UUID getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
}