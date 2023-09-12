package olio_ohjelmointi.week3_3.library.system;


import olio_ohjelmointi.week3_3.library.model.Book;
import olio_ohjelmointi.week3_3.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void addMember(LibraryMember member){
        members.add(member);
    }
    public void borrowBook(LibraryMember member, Book book){
        member.borrowBook(book);
        books.remove(book);
        System.out.println(member.getName() + " borrowed book: " + book.getTitle());
    }
    public void returnBook(LibraryMember member, Book book){
        books.add(book);
        member.returnBook(book);
        System.out.println(member.getName() + " returned book: " + book.getTitle());
    }
    public void reserveBook(LibraryMember member, Book book){
        if (!book.isReserved()){
            book.setReserved(true);
            member.addReservedBooks(book);
            System.out.println("Book reserved successfully");
        }else {
            System.out.println("Book is already reserved");
        }
    }
    public void cancelReservation(LibraryMember member, Book book){
        if (book.isReserved() && member.hasReservedBook(book)){
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("reservation canceled");
        }else {
            System.out.println("book was not reserved by this member");
        }
    }
    public void displayReservedBooks(LibraryMember member){
        System.out.println("reserved books fro " + member.getName());
        for (Book book : member.getReservedBooks()){
            System.out.println(book.getTitle());
        }
    }
}
