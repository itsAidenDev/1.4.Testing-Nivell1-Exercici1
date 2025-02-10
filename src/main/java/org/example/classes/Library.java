package org.example.classes;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookAt(int index) {
        return (index >= 0 && index < books.size() ? books.get(index) : null);
    }

    public void addBookAt(int index, Book book) {
        if (!books.contains(book) && index >= 0 && index <= books.size()) {
            books.add(index, book);
        }
    }

    public void removeBookTitle(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }
}
