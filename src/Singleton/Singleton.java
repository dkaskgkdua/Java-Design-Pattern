package Singleton;

/**
 * 시스템 안에서 1개의 인스턴스를 만드는 것을 보장하는 패턴
 * - 생성자가 private으로 인스턴스를 외부에서 새로 생성 못하게 함
 * - static으로 1개뿐인 인스턴스를 줌
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("싱글톤 생성");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
