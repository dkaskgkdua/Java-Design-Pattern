package FactoryMethod.framework;

/**
 * 생성되는 인스턴스가 가져야할 인터페이스(API)를 결정하는 추상 클래스임.
 * 구체적인 내용은 하위클래스가 결정
 */
public abstract class Product {
    public abstract void use();
}
