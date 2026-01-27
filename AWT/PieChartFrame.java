package AWT;

import java.awt.*;
import java.awt.event.*;

public class PieChartFrame extends Frame {

    PieChartFrame() {
        setTitle("Pie Chart");
        setSize(450, 450);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {

        int x = 120, y = 100;
        int w = 200, h = 200;

        // --- PIE SLICES ---
        // Green (largest bottom slice)
        g.setColor(Color.GREEN);
        g.fillArc(x, y, w, h, 210, 160);

        // Blue (top-left)
        g.setColor(Color.BLUE);
        g.fillArc(x, y, w, h, 30, 120);

        // Red (top-right)
        g.setColor(Color.RED);
        g.fillArc(x, y, w, h, 150, 70);

        // --- OUTER BORDER ---
        g.setColor(Color.BLACK);
        g.drawOval(x, y, w, h);

        // --- BLACK DIVIDING LINES (IMPORTANT PART) ---
        int cx = x + w / 2;
        int cy = y + h / 2;

        // horizontal cut
        g.drawLine(cx, cy, cx + 100, cy);

        // slanted cut 1
        g.drawLine(cx, cy, cx - 60, cy - 90);

        // slanted cut 2
        g.drawLine(cx, cy, cx - 90, cy + 40);
    }

    public static void main(String[] args) {
        new PieChartFrame();
    }
}

