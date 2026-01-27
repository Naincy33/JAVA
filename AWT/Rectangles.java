package AWT;

import java.awt.*;
public class Rectangles extends Frame {

    public void paint(Graphics g) {

        // Red empty rectangle
        g.setColor(Color.RED);
        g.drawRect(20, 40, 80, 60);

        // Blue filled rectangle
        g.setColor(Color.BLUE);
        g.fillRect(130, 40, 80, 60);

        // Green rounded rectangle (empty)
        g.setColor(Color.GREEN);
        g.drawRoundRect(240, 40, 80, 60, 20, 20);

        // Magenta filled rounded rectangle
        g.setColor(Color.MAGENTA);
        g.fillRoundRect(90, 130, 140, 90, 30, 40);

    }

    public static void main(String args[]) {
        Rectangles f = new Rectangles();
        f.setSize(600, 600);
        f.setVisible(true);
    }
}
