package FactoryMethod.framework;

/**
 * 이 클래스가 가지고 있는 정보는 Product 역할과 인스턴스 생성의 메소드를 호출하면
 * Product가 생성된다는 것이다.
 * new를 사용해서 실제의 인스턴스를 생성하는 대신에, 인스턴스 생성을 위한 메소드를
 * 호출해서 구체적인 클래스 이름에 의한 속박에서 상위 클래스를 자유롭게 만든다.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
