package AWT;

import java.awt.*;
import java.awt.event.*;

public class ShapesDemo extends Frame {

    ShapesDemo() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {

        /* -------- Polygon 1 -------- */
        int x1[] = {50, 80, 110, 80};
        int y1[] = {100, 70, 100, 130};
        g.drawPolygon(x1, y1, 4);

        /* -------- Polygon 2 -------- */
        int x2[] = {150, 200, 250, 200};
        int y2[] = {100, 70, 100, 130};
        g.drawPolygon(x2, y2, 4);

        /* -------- Polygon 3 -------- */
        int x3[] = {80, 120, 160, 120};
        int y3[] = {200, 160, 200, 240};
        g.fillPolygon(x3, y3, 4);

        /* -------- Polygon 4 -------- */
        int x4[] = {180, 220, 260, 220};
        int y4[] = {200, 160, 200, 240};
        g.fillPolygon(x4, y4, 4);

        /* -------- Rounded Rectangle -------- */
        g.drawRoundRect(100, 270, 160, 80, 30, 30);
    }

    public static void main(String args[]) {
        ShapesDemo f = new ShapesDemo();
        f.setSize(400, 400);
        f.setTitle("Polygons and Rounded Rectangle");
        f.setVisible(true);
    }
}
