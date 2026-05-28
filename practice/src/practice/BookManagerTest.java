package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookManagerTest {
    private BookManager bookManager;

    @BeforeEach
    void setUp() {
        bookManager = new BookManager();
    }

    @Test
    void testAddBook() {
        boolean result = bookManager.addBook("Clean Code");

        assertTrue(result);
        assertTrue(bookManager.hasBook("Clean Code"));
        assertEquals(1, bookManager.getBookCount());
    }

    @Test
    void testAddDuplicateBook() {
        bookManager.addBook("Clean Code");

        boolean result = bookManager.addBook("Clean Code");

        assertFalse(result);
        assertEquals(1, bookManager.getBookCount());
    }

    @Test
    void testAddEmptyBookTitle() {
        boolean result = bookManager.addBook("");

        assertFalse(result);
        assertEquals(0, bookManager.getBookCount());
    }

    @Test
    void testRemoveBook() {
        bookManager.addBook("Effective Java");

        boolean result = bookManager.removeBook("Effective Java");

        assertTrue(result);
        assertFalse(bookManager.hasBook("Effective Java"));
        assertEquals(0, bookManager.getBookCount());
    }

    @Test
    void testRemoveNotExistingBook() {
        boolean result = bookManager.removeBook("Unknown Book");

        assertFalse(result);
        assertEquals(0, bookManager.getBookCount());
    }
}