package com.example.servingwebcontent.Model;

public class Book {
    public String bookID;
    public String title;
    public String author;
    public boolean isAvailable;
    public int quantity;
    public Book() {
        this.isAvailable = true;
    }

    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.quantity = 10;
    }

    public void markAsBorrowed() {
        this.isAvailable = false;
    }

    public void markAsReturned() {
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable +", Quantity: " + quantity);
    }

    public void setQuantity(int int1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setQuantity'");
    }
}

