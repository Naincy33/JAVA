package AWT;

import java.awt.*;
import java.awt.event.*;

public class SimpleMouseEvents extends Frame {

    String msg = "Mouse Demo";
    int x = 50, y = 50;

    SimpleMouseEvents() {

        // MouseListener (4 events)
        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                msg = "Clicked";
                repaint();
            }

            public void mousePressed(MouseEvent e) {
                msg = "Pressed";
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                msg = "Released";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                msg = "Entered";
                repaint();
            }
        });

        // MouseMotionListener (2 events)
        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                msg = "Moved";
                repaint();
            }

            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                msg = "Dragged";
                repaint();
            }
        });

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }

    public static void main(String args[]) {
        SimpleMouseEvents f = new SimpleMouseEvents();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
