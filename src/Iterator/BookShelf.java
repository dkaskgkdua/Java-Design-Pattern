package Iterator;

/**
 * ConcreateAggregate(구체적인 집합체)의 역할
 * Aggregate 역할이 결정한 인터페이스(API)를 직접 구현하는 일을 한다.
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
