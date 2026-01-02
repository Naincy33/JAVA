package AWT;

import java.awt.*;
import java.awt.event.*;

public class SadSmileyRelative extends Frame {

    public SadSmileyRelative() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        int diameter = 150;

        // Window size
        int w = getWidth();
        int h = getHeight();

        // Center of window
        int cx = (w - diameter) / 2;
        int cy = (h - diameter) / 2;

        /* -------- FACE -------- */
        g.setColor(Color.PINK);
        g.fillOval(cx, cy, diameter, diameter);

        /* -------- EYES -------- */
        g.setColor(Color.BLACK);
        g.fillOval(cx + 40, cy + 45, 15, 25);   // left eye
        g.fillOval(cx + 95, cy + 45, 15, 25);   // right eye

        /* -------- NOSE (Triangle) -------- */
        int x[] = {cx + 75, cx + 90, cx + 60};
        int y[] = {cy + 70, cy + 95, cy + 95};
        g.drawPolygon(x, y, 3);

        /* -------- SAD MOUTH (Arc) -------- */
        // 0° start makes it sad 😢
        g.drawArc(cx + 35, cy + 110, 80, 45, 0, 180);

        /* -------- CHEEKS / DIM PLES -------- */
        //g.drawLine(cx + 40, cy + 115, cx + 30, cy + 135); // left cheek
        //g.drawLine(cx + 110, cy + 115, cx + 120, cy + 135); // right cheek
    }

    public static void main(String[] args) {
        SadSmileyRelative f = new SadSmileyRelative();
        f.setSize(400, 400);
        f.setTitle("Sad Smiley");
        f.setVisible(true);
    }
}
