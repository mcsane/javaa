package olio_ohjelmointi.week3_3.library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    List<Book> borrowedBooks;
    List<Book> reservedBooks;

    public LibraryMember(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    public void addReservedBooks(Book book){
        reservedBooks.add(book);
    }
    public void removeReservedBook(Book book){
        reservedBooks.remove(book);
    }
    public boolean hasReservedBook(Book book){
        return reservedBooks.contains(book);
    }
    public List<Book>getReservedBooks(){return reservedBooks;}
    public String getName(){return name;}
}
