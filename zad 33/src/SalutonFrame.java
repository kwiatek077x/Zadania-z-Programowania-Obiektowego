import javax.swing.*;
import java.awt.*;

public class SalutonFrame extends JFrame {
    public SalutonFrame() {
     //   super("Saluton mondo!");
        JLabel pageLabel = new JLabel("Saluton mondo!",JLabel.CENTER);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        setLookAndFeel();
        setSize(450, 200);
        add(pageLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                   "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignoruj bląd
       }
    }

    public static void main(String[] arguments) {
        SalutonFrame frame = new SalutonFrame();
    }
}