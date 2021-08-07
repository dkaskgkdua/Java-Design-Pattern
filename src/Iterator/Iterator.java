package Iterator;

/**
 * 요소를 순서대로 검색해가는 인터페이스(API)를 결정한다.
 * 다음 요소가 존재하는지 얻기 위한 hasNext 메소드와
 * 다음 요소를 얻기 위한 next 메소드를 결정한다.
 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
