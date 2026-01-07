package AWT;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MouseColorDemo extends Frame {

    int x = 100, y = 100;
    String msg = "Drag the mouse";
    Random r = new Random();

    MouseColorDemo() {

        // Mouse events using adapter class
        addMouseListener(new MouseAdapter() {

            // Left mouse button pressed
            public void mousePressed(MouseEvent me) {
                if (me.getButton() == MouseEvent.BUTTON1) {
                    setBackground(new Color(
                            r.nextInt(256),
                            r.nextInt(256),
                            r.nextInt(256)));

                    setForeground(new Color(
                            r.nextInt(256),
                            r.nextInt(256),
                            r.nextInt(256)));

                    msg = "Mouse Pressed";
                    repaint();
                }
            }

            // Mouse released → default colors
            public void mouseReleased(MouseEvent me) {
                setBackground(Color.WHITE);
                setForeground(Color.BLACK);
                msg = "Mouse Released";
                repaint();
            }
        });

        // Mouse motion events
        addMouseMotionListener(new MouseMotionAdapter() {

            // Mouse dragged → show position
            public void mouseDragged(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                msg = "Mouse Dragged at (" + x + ", " + y + ")";
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

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }

    public static void main(String args[]) {
        MouseColorDemo f = new MouseColorDemo();
        f.setSize(400, 300);
        f.setTitle("Mouse Color Demo");
        f.setVisible(true);
    }
}
