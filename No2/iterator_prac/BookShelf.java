import java.util.*;
public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf(int maxSize) {
        books = new ArrayList<Book>(maxSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
