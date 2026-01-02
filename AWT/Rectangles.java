package AWT;

import java.awt.*;

public class Rectangles extends Frame {

    public void paint(Graphics g) {

        g.drawRect(20, 50, 60, 60);          // empty rectangle
        g.fillRect(100, 50, 60, 50);         // filled rectangle

        g.drawRoundRect(190, 50, 60, 50, 15, 15);   // rounded empty
        g.fillRoundRect(70, 200, 140, 100, 30, 40); // rounded filled
    }

    public static void main(String args[]) {
        Rectangles f = new Rectangles();
        f.setSize(600, 600);
        f.setVisible(true);
    }
}
