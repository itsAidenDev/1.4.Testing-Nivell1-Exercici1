package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Library {
    private List<Book> allBooks;

    public Library(){
        ArrayList allBooks = new ArrayList<>();
    }

    //Add a book to the end of the collection
    public void addBook(Book book){
        if (!allBooks.contains(book)) {
            allBooks.add(book);
            System.out.println("Book added: " + book);
            // sortBooksByTitle();
        }
    }

    //Add a book to a specific position
    public void addBookToPos(int pos, Book book) {
        if (!allBooks.contains(book)) {
            allBooks.add(pos, book);
        }
    }

    //Book list
    public List<Book> getBookList() {
        System.out.println("Book list: " + allBooks);
        return new ArrayList<>(allBooks);
    }

    //Get book by its position (index)
    public Book getBookByPos(int pos) {
        if (pos >= 0 && pos < allBooks.size()) {
            return allBooks.get(pos);
        } else {
            throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }
    }

    //Delete book by title
    public void removeBook(Book book) {
        allBooks.remove(book);
    }

    private void sortBooksByTitle() {
        Collections.sort(allBooks,Comparator.comparing(Book::getTitle));
    }
}

