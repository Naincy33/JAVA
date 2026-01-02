import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {
    MyFrame() {
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();   // better than setVisible(false)
            }
        });
    }
}

public class MyApplet {
    public static void main(String[] args) {
        new MyFrame();
    }
}
