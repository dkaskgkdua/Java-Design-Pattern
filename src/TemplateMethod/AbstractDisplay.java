package TemplateMethod;

/**
 * 템플릿 메소드를 구현함. 또한 내부에 추상 메소드 선언
 * 추상 메소드는 하위 클래스에서 구현됨
 */
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display() {
        open();
        for(int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
