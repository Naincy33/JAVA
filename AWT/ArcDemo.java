package AWT;

import java.awt.*;

public class ArcDemo extends Frame {

    public void paint(Graphics g) {
        g.drawArc(50, 50, 150, 150, 0, 180);
    }

    public static void main(String[] args) {
        ArcDemo f = new ArcDemo();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
