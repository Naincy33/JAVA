package AWT;

import java.awt.*;
import java.awt.event.*;

public class HexagonFrame extends Frame {

    HexagonFrame() {
        setTitle("Hexagon Box");
        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {

        // -------- TOP HEXAGON (outline) --------
        int xt[] = {140, 190, 250, 270, 210, 150};
        int yt[] = {90, 60, 90, 130, 150, 130};

        g.setColor(Color.BLACK);
        g.drawPolygon(xt, yt, 6);

        // -------- BOTTOM HEXAGON (filled) --------
        int xb[] = {160, 210, 270, 250, 200, 150};
        int yb[] = {140, 120, 140, 180, 200, 180};

        g.setColor(Color.BLACK);
        g.fillPolygon(xb, yb, 6);

        // -------- ONLY TWO SIDE CONNECTIONS --------
        // left face
        g.drawLine(140, 90, 160, 140);

        // right face
        g.drawLine(270, 130, 250, 180);
    }

    public static void main(String[] args) {
        new HexagonFrame();
    }
}
