package Prototype;

import Prototype.framework.Manager;
import Prototype.framework.Product;

/**
 * Prototype이 필요한 이유
 * 1. 종류가 너무 많아서 클래스로 정리할 수 없는 경우
 *  - 예제처럼 각종 기호가 여러개 들어가는 경우...
 *
 * 2. 클래스로부터 인스턴스 생성이 어려운 경우
 *  - 마우스를 사용해서 도형 에디터와 같은 어플리케이션(ppt, 한글 등)
 *
 * 3. framework와 생성하는 인스턴스를 분리하고 싶은 경우
 *  - 인스턴스의 복사를 실행하는 부분을 framework 패키지 안에 설정
 *  - 예제에선 클래스 이름 대신 문자열을 인스턴스 생성을 위한 이름으로 제공(키값)
 *     클래스 이름을 선언해야 하는 것으로부터 자유로움...
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world");
    }
}
