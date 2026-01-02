package AWT;

import java.awt.*;

public class CircleDemo extends Frame {

    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.drawOval(50, 50, 100, 100); // circle
    }

    public static void main(String[] args) {
        CircleDemo f = new CircleDemo();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
