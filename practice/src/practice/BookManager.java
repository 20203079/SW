package practice;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private final List<String> books = new ArrayList<>();

    public boolean addBook(String title) {
        if (title == null || title.trim().isEmpty()) {
            return false;
        }

        if (books.contains(title)) {
            return false;
        }

        books.add(title);
        return true;
    }

    public boolean removeBook(String title) {
        return books.remove(title);
    }

    public boolean hasBook(String title) {
        return books.contains(title);
    }

    public int getBookCount() {
        return books.size();
    }
}