package org.example.main;

import org.example.classes.Book;
import org.example.classes.Library;

public class Main {
    public static void main(String[] args) {
        Library collection = new Library();

        /*Add books
        collection.addBook(new Book("1984", "George Orwell"));
        collection.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        collection.addBook(new Book());
         */

        //Print book list
        System.out.println("Book List:");
        for(Book book : collection.getBookList()) {
            System.out.println(book);
        }

        /*//Get a book by its position (index)
        Book book = collection.getBookByPos(2);
        System.out.println("\nBook at position" + i + ": " + book);

        //Remove a book
        collection.removeBook(book);
        System.out.println("");*/


    }
}