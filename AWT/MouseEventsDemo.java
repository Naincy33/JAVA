package AWT;

import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame
    implements MouseListener, MouseMotionListener {

    String msg = "Hello GM";
    int mouseX = 0, mouseY = 0;

    // Constructor
    public MouseEventsDemo() {

        addMouseListener(this);
        addMouseMotionListener(this);

        // Window close handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    /* ---------- MouseListener methods ---------- */
    // Mouse click
    public void mouseClicked(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse Clicked";
        repaint();
    }

    // Mouse button pressed
    public void mousePressed(MouseEvent me) {
        msg = "Mouse Pressed";
        setBackground(Color.CYAN);
        setForeground(Color.RED);
        repaint();
    }

    // Mouse button released
    public void mouseReleased(MouseEvent me) {
        msg = "Mouse Released";
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        // not used
    }

    public void mouseExited(MouseEvent me) {
        // not used
    }

    /* ---------- MouseMotionListener methods ---------- */
    // Mouse dragged (button pressed + move)
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Dragging mouse at " + mouseX + ", " + mouseY;
        repaint();
    }

    // Mouse moved (without pressing)
    public void mouseMoved(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Moving mouse at " + mouseX + ", " + mouseY;
        repaint();
    }

    /* ---------- Paint method ---------- */
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }

    /* ---------- Main method ---------- */
    public static void main(String args[]) {
        MouseEventsDemo win = new MouseEventsDemo();
        win.setSize(300, 300);
        win.setTitle("MouseEventsDemo");
        win.setVisible(true);
    }
}
