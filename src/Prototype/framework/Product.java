package Prototype.framework;

/**
 * 인스턴스를 복사하여 새로운 인스턴스를 만들기 위한 메소드를 결정
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
