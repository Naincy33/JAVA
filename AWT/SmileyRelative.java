package AWT;

import java.awt.*;
import java.awt.event.*;

public class SmileyRelative extends Frame {

    // Constructor
    public SmileyRelative() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        int diameter = 150;

        // Window dimensions
        int w = getWidth();
        int h = getHeight();

        // Center position
        int cx = (w - diameter) / 2;
        int cy = (h - diameter) / 2;

        /* ---------- FACE ---------- */
        g.setColor(Color.YELLOW);
        g.fillOval(cx, cy, diameter, diameter);

        /* ---------- EYES ---------- */
        g.setColor(Color.BLACK);
        g.fillOval(cx + 30, cy + 40, 15, 25);   // left eye
        g.fillOval(cx + 105, cy + 40, 15, 25);  // right eye

        /* ---------- NOSE (Polygon) ---------- */
        int x[] = {cx + 75, cx + 96, cx + 85, cx + 75};
        int y[] = {cy + 65, cy + 65, cy + 85, cy + 65};
        g.drawPolygon(x, y, 4);

        /* ---------- SMILE (Arc) ---------- */
        // startAngle = 180 makes it a smile 🙂
        g.drawArc(cx + 35, cy + 80, 80, 50, 180, 180);

        /* ---------- DIMPLES (Lines) ---------- */
        // left dimple
        g.drawLine(cx + 37, cy + 102, cx + 23, cy + 112);

        // right dimple
        g.drawLine(cx + 117, cy + 102, cx + 123, cy + 110);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        SmileyRelative app = new SmileyRelative();
        app.setSize(400, 400);
        app.setTitle("SmileyRelative");
        app.setVisible(true);
    }
}
