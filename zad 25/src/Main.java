import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList servants = new ArrayList(30);
        ArrayList<String> servants = new ArrayList<String>();
        servants.add("kadzidlo@wp.pl");
        servants.add("karman@wp.pl");
        servants.add("kowalski@wp.pl");
        servants.add("majkowski@wp.pl");
        servants.add("tomorowski@wp.pl");


        servants.remove("karman@wp.pl");

        for (String servant : servants) {
            System.out.println(servant);
        }


    }

}
