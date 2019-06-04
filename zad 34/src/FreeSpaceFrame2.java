import java.awt.*;
import javax.swing.*;

public class FreeSpaceFrame2 extends JFrame {
    public FreeSpaceFrame2() {
        super("Disk Free Space");
        setLookAndFeel();
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        FreeSpacePanel2 freePanel = new FreeSpacePanel2();
        add(freePanel);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {

        }
    }

    public static void main(String[] arguments) {
        FreeSpaceFrame2 frame = new FreeSpaceFrame2();
    }
}