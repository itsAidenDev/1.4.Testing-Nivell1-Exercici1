package org.example;

import org.example.classes.Book;
import org.example.classes.Library;
import org.example.classes.LibraryManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp(){
        library = new Library();
        library.addBook(new Book("Crime and Punishment"));
        library.addBook(new Book("Don Quixote"));
    }
    @Test
    void testLibraryNotNull(){
        assertNotNull(library.getBooks());
    }

    @Test
    void testAddBook(){
        library.addBook(new Book("The Lord of the Rings"));
        assertEquals(3 , library.getBooks().size());
    }

    @Test
    void testGetBookAt(){
        assertTrue(library.getBookAt(1).getTitle().equalsIgnoreCase("Don Quixote"));
    }

    @Test
    void testAddBookAt(){
        library.addBookAt(1, new Book("Moby Dick"));
        assertEquals("Moby Dick", library.getBookAt(1).getTitle());
    }

    @Test
    void testRemoveBookTitle(){
        library.removeBookTitle("Don Quixote");
        assertEquals(1, library.getBooks().size());
    }
}
