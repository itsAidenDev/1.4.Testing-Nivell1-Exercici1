package org.example;

import org.example.classes.Book;
import org.example.classes.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp(){
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book1 = new Book("Brave New World", "Aldous Huxley");
        Book book2 = new Book("Hamlet", "William Shakespeare");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
        String allBooks = library.getBookList();
        allBooks.add(book1);
        allBooks.add(book2);
        assertNotNull(library.getBookList().size(),
                "Book list should not be null after creation");
        assertTrue(allBooks.contains(book1), "'Brave New World' should be in the list");
        assertTrue(allBooks.contains(book2), "'Hamlet' should be in the list");
        assertFalse(allBooks.contains(book3), "'To Kill a Mockingbird' shouldn't be in the list");
        assertFalse(allBooks.isEmpty());
    }

    @Test
    public void testGetBookByPos() {
        Book book1 = new Book("Brave New World", "Aldous Huxley");
        Book book2 = new Book("Hamlet", "William Shakespeare");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(book1, library.getBookByPos(0), "Book in position 0 should be 'Brave New World'");
        assertEquals("Not valid position", library.getBookByPos(15));
    }

}