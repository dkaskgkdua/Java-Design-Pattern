package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreateAggregate(구체적인 집합체)의 역할
 * Aggregate 역할이 결정한 인터페이스(API)를 직접 구현하는 일을 한다.
 */
public class BookShelfArrayList implements Aggregate {
    private List<Book> books;
    private int last = 0;
    public BookShelfArrayList(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        books.add(last, book);;
        last++;
    }
    public int getLength() {
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIteratorArrayList(this);
    }
}
