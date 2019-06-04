import java.io.*;


public class Id3 {
    public static void main(String[] arguments) {
        try {
            File folder = new File(".");
            File[] contents = folder.listFiles();
            for (File content : contents) {
                String name = content.getName();
                if (!name.contains(".mp3")) {
                    continue;
                }
                FileInputStream file = new FileInputStream(content);
                int size = (int) content.length();
                file.skip(size - 128);
                byte[] last128 = new byte[128];
                file.read(last128);
                String id3 = new String(last128);
                String tag = id3.substring(0, 3);
                if (tag.equals("TAG")) {

                    String title = id3.substring(3, 32);
                    title = title.trim();
                    String artist = id3.substring(33, 62);
                    artist = artist.trim();
                    String album = id3.substring(63, 91);
                    album = album.trim();
                    file.close();

                    StringBuilder newName = new StringBuilder();
                    newName.append(artist);
                    if (title.length() > 0) {
                        newName.append(" - ").append(title);
                    }
                    if (album.length() > 0) {
                        newName.append(" (").append(album).append(")");
                    }
                    File newFile = new File(newName.toString() + ".mp3");

                    content.renameTo(newFile);
                    System.out.println(newFile.getName());
                } else {
                    file.close();
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error -- " + ioe.toString());
        }
    }
}