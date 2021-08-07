package Iterator;

/**
 * Iterator를 분리하여 구현함으로써 BookShelf 클래스가 변경되더라도
 * 올바른 Iterator만 반환해준다면 정상적으로 동작한다.
 * 또한 부품처럼 사용하여 재이용화가 가능하다.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("책1"));
        bookShelf.appendBook(new Book("책2"));
        bookShelf.appendBook(new Book("책3"));
        bookShelf.appendBook(new Book("책4"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
        System.out.println(it.hasNext());
    }
}
