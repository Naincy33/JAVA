package AWT;

import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo extends Frame {

    // Constructor
    public GraphicsDemo() {

        // Window close handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Drawing part
    public void paint(Graphics g) {

        /* -------- Draw Lines -------- */
        g.setColor(Color.RED);
        g.drawLine(20, 40, 100, 90);

        g.setColor(Color.BLUE);
        g.drawLine(20, 90, 100, 40);

        g.setColor(Color.GREEN);
        g.drawLine(40, 45, 250, 90);

        /* -------- Draw Rectangles -------- */
        g.setColor(Color.BLACK);
        g.drawRect(20, 150, 60, 50);     // empty rectangle

        g.setColor(Color.CYAN);
        g.fillRect(110, 150, 60, 50);    // filled rectangle

        /* -------- Draw Rounded Rectangles -------- */
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(200, 150, 60, 50, 15, 15);

        g.setColor(Color.ORANGE);
        g.fillRoundRect(290, 150, 60, 50, 30, 40);

        /* -------- Draw Oval / Circle -------- */
        g.setColor(Color.DARK_GRAY);
        g.drawOval(20, 250, 50, 50);     // circle

        /* -------- Draw Arcs -------- */
        g.setColor(Color.PINK);
        g.drawArc(10, 40, 70, 70, 0, 75);

        g.setColor(Color.YELLOW);
        g.fillArc(100, 40, 70, 70, 0, -180);

        /* -------- Draw Polygon -------- */
        g.setColor(Color.BLUE);

        int xpoints[] = {20, 200, 20, 200, 20,30};
        int ypoints[] = {450, 450, 650, 650, 450,300};
        int num = 6;

        g.fillPolygon(xpoints, ypoints, num);
    }

    // Main method
    public static void main(String args[]) {

        GraphicsDemo appwin = new GraphicsDemo();
        appwin.setSize(370, 700);
        appwin.setTitle("Graphics Demo with Colors");
        appwin.setVisible(true);
    }
}
