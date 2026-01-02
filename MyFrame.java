import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {

    MyFrame() {
        // Frame title
        setTitle("My AWT Frame");

        // Size of frame
        setSize(400, 300);

        // Layout
        setLayout(new FlowLayout());

        // Components
        Label l = new Label("Welcome to AWT");
        Button b = new Button("Click Me");

        // Add components
        add(l);
        add(b);

        // Close button handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Make frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
