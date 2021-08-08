package Iterator;

/**
 * Iterator가 결정한 인터페이스(API)를 실제로 구현
 * 필요한 정보인 bookshelf와 index를 보유함
 */
public class BookShelfIteratorArrayList implements Iterator{
    private BookShelfArrayList bookshelf;
    private int index;
    public BookShelfIteratorArrayList(BookShelfArrayList bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }
    public boolean hasNext() {
        if(index < bookshelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }
    public Object next() {
        Book book = bookshelf.getBookAt(index);
        index++;
        return book;
    }
}
