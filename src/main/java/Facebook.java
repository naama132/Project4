import java.awt.*;

public class Facebook extends BasicJPanel{
    private static final String URL_FA="https://he-il.facebook.com/";
    public Facebook(int x, int y, int w, int h, Color color, String title) {
        super(x, y, w, h, color, title);
    }
    public Facebook(int x, int y, int w, int h, String fieldName, String title) {
        super(x, y, w, h, fieldName, title);
    }
    public Facebook(int x, int y, int w, int h, String fieldName) {
        super(x, y, w, h, fieldName);
    }
    
}
