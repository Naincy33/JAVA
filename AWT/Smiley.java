package AWT;

import java.awt.*;
import java.awt.event.*;

public class Smiley extends Frame {

    // Constructor
    public Smiley() {

        // Close button handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Drawing part
    public void paint(Graphics g) {

        /* ---- Face ---- */
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 150, 150);   // face

        /* ---- Eyes ---- */
        g.setColor(Color.BLACK);
        g.fillOval(50, 60, 15, 25);     // left eye
        g.fillOval(120, 60, 15, 25);    // right eye

        /* ---- Nose (Polygon) ---- */
        int x[] = {85, 106, 95, 85};
        int y[] = {85, 85, 104, 85};
        g.drawPolygon(x, y, 4);

        /* ---- Smile (Arc) ---- */
        g.drawArc(55, 115, 78, 50, 180, 180);

        // Left dimple
        g.drawLine(55, 135, 45, 145);

// Right dimple
        g.drawLine(125, 135, 135, 145);

    }

    // Main method
    public static void main(String args[]) {

        Smiley awin = new Smiley();
        awin.setSize(500, 500);
        awin.setTitle("Smiley");
        awin.setVisible(true);
    }
}
