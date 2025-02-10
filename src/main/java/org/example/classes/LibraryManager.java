package org.example.classes;

public class LibraryManager {
    public static void  run(){
        Library library = new Library();

        library.addBook(new Book("To Kill A Mockingbird"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("Pride and Prejudice"));

        System.out.println("Books in the library: "+ library.getBooks());

        System.out.println("Book in position 1: "+ library.getBookAt(0));

        System.out.println("Adding '1984' to position 1...");
        library.addBookAt(0, new Book("1984"));
        System.out.println("Book in position 1:  "+ library.getBookAt(0));

        System.out.println("Deleting 'Pride and Prejudice'...");
        library.removeBookTitle("Pride and Prejudice");
        System.out.println("New book list: " + library.getBooks());

    }
}
