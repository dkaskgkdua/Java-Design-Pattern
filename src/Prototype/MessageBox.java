package Prototype;

import Prototype.framework.Product;

/**
 * 인스턴스를 복사해서 새로운 인스턴스를 만드는 메소드를 실제 구현 1
 */
public class MessageBox implements Product {
    private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for(int i =0; i < length + 4; i++ ) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
