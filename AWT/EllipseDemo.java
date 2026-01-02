package AWT;

import java.awt.*;

public class EllipseDemo extends Frame {

    public void paint(Graphics g) {
        g.drawOval(40, 60, 160, 80); // ellipse
        g.fillOval(40, 320, 160, 80);
    }

    public static void main(String[] args) {
        EllipseDemo f = new EllipseDemo();
        f.setSize(800, 800);
        f.setVisible(true);
    }
}
