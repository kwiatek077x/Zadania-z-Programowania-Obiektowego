import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;

public class FreeSpacePanel2 extends JPanel {
    JLabel spaceLabel = new JLabel("Disk space: ");
    JLabel space = new JLabel();

    public FreeSpacePanel2() {
        super();
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException ioe) {
            space.setText("Error");
        }
    }

    private final void setValue() throws IOException {

        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);

        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();

        double percent = (double)freeSpace / (double)totalSpace * 100;
        percent = (int)(percent * 100) / (double)100;

        space.setText(getValueWithCommas(freeSpace) + " free out of " +
                getValueWithCommas(totalSpace) + " (" + percent + "%)");
    }

    private String getValueWithCommas(long value) {
        String input = "" + value;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if ((input.length()- i) % 3 == 0) {

                output.append(" ");
            }
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}