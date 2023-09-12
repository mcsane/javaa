package olio_ohjelmointi.week3_3.library;

import olio_ohjelmointi.week3_3.library.model.Book;
import olio_ohjelmointi.week3_3.library.model.LibraryMember;
import olio_ohjelmointi.week3_3.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("harri", "jaakko", "kkotia");
        Book book2 = new Book("pessi", "rolle", "salasana");

        LibraryMember member1 = new LibraryMember("kake", 1);
        LibraryMember member2 = new LibraryMember("jake", 2);

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        //library.borrowBook(member1, book1);
        //library.returnBook(member1, book1);
        library.reserveBook(member1, book2);
        library.reserveBook(member2, book1);
        library.displayReservedBooks(member1);
        library.cancelReservation(member1, book2);
    }
}
