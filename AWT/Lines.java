package AWT;

import java.awt.*;
import java.Applet.*;

public class Lines extends Frame {

    public void paint(Graphics g) {

        g.drawLine(0, 0, 100, 100);

    }

    public static void main(String[] args) {
        Lines f = new Lines();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
