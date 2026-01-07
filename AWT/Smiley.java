package AWT;

import java.awt.*;
import java.awt.event.*;

public class Smiley extends Frame {

    Smiley() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {

        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(80, 80, 200, 200);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(130, 140, 20, 30);   // left eye
        g.fillOval(210, 140, 20, 30);   // right eye

        // Smile
        g.drawArc(140, 190, 80, 50, 180, 180);
    }

    public static void main(String args[]) {
        Smiley s = new Smiley();
        s.setSize(400, 400);
        s.setTitle("Smiley");
        s.setVisible(true);
    }
}
