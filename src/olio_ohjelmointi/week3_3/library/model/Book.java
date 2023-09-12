package olio_ohjelmointi.week3_3.library.model;

import olio_ohjelmointi.week3_3.task1.BankAccount;

public class Book {
    private String title;
    private String author;
    private String isbn;
    boolean reserved;
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.reserved = false;
    }
    public String getTitle(){return title;}
    public boolean isReserved(){return reserved;}
    public void setReserved(boolean k){
        reserved = k;
    }
}
