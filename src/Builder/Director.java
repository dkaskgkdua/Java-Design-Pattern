package Builder;


/**
 * 한 개의 문서를 만드는 클래스
 * Builder 클래스로 선언되어 있는 메소드를 사용해서 문서를 만듬.
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("아침과 낮에");
        builder.makeItems(new String[] {
                "좋은 아침입니다.",
                "안녕하세요."
        });
        builder.makeString("밤에");
        builder.makeItems(new String[] {
                "안녕하세요.",
                "안녕히 주무세요.",
                "안녕히 계세요."
        });
        builder.close();
    }
}
