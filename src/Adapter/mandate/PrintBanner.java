package Adapter.mandate;

import Adapter.Banner;

/**
 * 기존 패턴과 다르게 인스턴스에 의한 Adapter 패턴이다.
 * 기존은 상속을 사용했지만 이번은 '위임'인 것이다.
 * Banner를 인스턴스로 가짐으로써 필드를 경유해서 위임했다.
 */
public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
