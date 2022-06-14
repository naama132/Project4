import javax.swing.*;
import java.awt.*;

public class BasicJPanel extends JPanel {
    private ImageIcon backGround;
    private JLabel title;

    public BasicJPanel(int x, int y, int w, int h, Color color, String title) {
        this.setBounds(x, y, w, h);
        this.setBackground(color);
        this.backGround = null;
        init();
    }

    public BasicJPanel(int x, int y, int w, int h, String fieldName, String title) {
        this.setBounds(x, y, w, h);
        this.title = addJLabel(title, 0, 0, this.getWidth(), 800, 400, Color.blue.brighter());
        this.title.setOpaque(true);
        this.backGround = new ImageIcon(fieldName);
        init();
    }

    public BasicJPanel(int x, int y, int w, int h, String fieldName) {
        this.setBounds(x, y, w, h);
        this.backGround = new ImageIcon(fieldName);
        init();
    }

    public void init() {
        this.setLayout(null);
        this.setDoubleBuffered(true);
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.backGround != null) {
            this.backGround.paintIcon(this, g, 0, 0);
        }
    }

    public JLabel addJLabel(String title, int x, int y, int w, int h, int size, Color color) {
        JLabel jLabel = new JLabel(title, SwingConstants.CENTER);
        jLabel.setFont(new Font("ariel", Font.BOLD, size));
        jLabel.setForeground(color);
        jLabel.setBounds(x, y, w, h);
        this.add(jLabel);
        return jLabel;
    }
}