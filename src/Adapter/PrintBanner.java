package Adapter;

/**
 * 상속을 이용한 Adapter 패턴
 * Banner 클래스를 이용해서 Print 인터페이스를 만족시키는 클래스를 만드는 것!
 * PrintBanner 클래스가 어뎁터 역할을 한다.
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
