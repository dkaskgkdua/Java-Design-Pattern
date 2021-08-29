package Builder;

/**
 * 일반 텍스트를 이용해서 문서를 만드는 클래스
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("┌").append(title).append("┘\n");
        buffer.append("\n");
    }
    public void makeString(String str) {
        buffer.append('■').append(str).append("\n");
        buffer.append("\n");
    }
    public void makeItems(String[] items) {
        for(int i = 0; i < items.length; i++) {
            buffer.append(" ⊙").append(items[i]).append("\n");
        }
        buffer.append("\n");
    }
    public void close() {
        buffer.append("===================================\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
