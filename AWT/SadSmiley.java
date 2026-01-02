package AWT;

import java.awt.*;
import java.awt.event.*;

public class SadSmiley extends Frame {

    SadSmiley() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {

        /* ---- Face ---- */
        g.setColor(Color.PINK);
        g.fillOval(50, 50, 150, 150);   // face

        /* ---- Eyes ---- */
        g.setColor(Color.BLACK);
        g.fillOval(90, 90, 15, 25);     // left eye
        g.fillOval(145, 90, 15, 25);    // right eye

        /* ---- Nose (Triangle) ---- */
        int x[] = {125, 140, 110};
        int y[] = {115, 140, 140};
        g.drawPolygon(x, y, 3);

        /* ---- Sad Mouth ---- */
        g.drawArc(90, 155, 80, 50, 0, 180);  // sad arc

        /* ---- Cheeks / Dimples ---- */
        //g.drawLine(95, 160, 85, 175);    // left cheek
        //g.drawLine(165, 160, 175, 175);  // right cheek
    }

    public static void main(String[] args) {
        SadSmiley s = new SadSmiley();
        s.setSize(300, 300);
        s.setTitle("Sad Smiley");
        s.setVisible(true);
    }
}
