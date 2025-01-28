package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp(){
        library = new Library();
    }

    @Test
    public void testNotNullList() {
        assertNotNull(library.getBookList(),
                "Book list should not be null after creation");
    }


}
