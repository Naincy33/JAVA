package AWT;

import java.awt.*;
import java.awt.event.*;

public class MouseAdapterDemo extends Frame {

    int x = 100, y = 100;
    String msg = "Mouse Events Demo";

    // Constructor
    MouseAdapterDemo() {

        // MouseListener using MouseAdapter
        addMouseListener(new MouseAdapter() {

            // 1. mouseClicked
            public void mouseClicked(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                msg = "Mouse Clicked";
                repaint();
            }

            // 2. mousePressed
            public void mousePressed(MouseEvent me) {
                msg = "Mouse Pressed";
                setBackground(Color.CYAN);
                repaint();
            }

            // 3. mouseReleased
            public void mouseReleased(MouseEvent me) {
                msg = "Mouse Released";
                setBackground(Color.WHITE);
                repaint();
            }
        });

        // MouseMotionListener using MouseMotionAdapter
        addMouseMotionListener(new MouseMotionAdapter() {

            // 1. mouseMoved
            public void mouseMoved(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                msg = "Mouse Moved";
                repaint();
            }

            // 2. mouseDragged
            public void mouseDragged(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                msg = "Mouse Dragged";
                repaint();
            }
        });

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Paint method
    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }

    // Main method
    public static void main(String args[]) {
        MouseAdapterDemo f = new MouseAdapterDemo();
        f.setSize(400, 300);
        f.setTitle("Mouse Adapter Demo");
        f.setVisible(true);
    }
}
