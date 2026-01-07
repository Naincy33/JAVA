package AWT;

import java.awt.*;
import java.awt.event.*;

public class PolygonDemo extends Frame {

    // Constructor
    PolygonDemo() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Drawing
    public void paint(Graphics g) {

        /* ---------- TOP HOLLOW POLYGON ---------- */
        int x1[] = {100, 170, 240, 190, 120, 60};
        int y1[] = {130, 90, 130, 170, 170, 130};

        g.setColor(Color.BLACK);
        g.drawPolygon(x1, y1, 6);

        /* ---------- BOTTOM FILLED POLYGON ---------- */
        int x2[] = {100, 170, 240, 190, 120, 60};
        int y2[] = {230, 190, 230, 270, 270, 230};

        g.setColor(Color.BLACK);
        g.fillPolygon(x2, y2, 6);
    }

    // Main method
    public static void main(String[] args) {
        PolygonDemo f = new PolygonDemo();
        f.setSize(400, 400);
        f.setTitle("Polygon Output");
        f.setVisible(true);
    }
}
