package AWT;

import java.awt.*;
import java.awt.event.*;


public class DoNotEnter extends Frame {

    DoNotEnter() {
        setTitle("Do Not Enter Sign");
        setSize(400, 300);
        setVisible(true);

        // Window close handle
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {

        // Outer rectangle (Green)
        g.setColor(Color.GREEN);
        g.fillRect(50, 40, 300, 200);

        g.setColor(Color.BLACK);
        g.drawRect(50, 40, 300, 200);

        // White outer circle
        g.setColor(Color.WHITE);
        g.fillOval(110, 50, 180, 180);

        // Inner red circle
        g.setColor(Color.RED);
        g.fillOval(120, 60, 160, 160);

        // Inner white rectangle (bar)
        g.setColor(Color.WHITE);
        g.fillRect(150, 130, 100, 30);
    }

    public static void main(String[] args) {
        new DoNotEnter();
    }
}
