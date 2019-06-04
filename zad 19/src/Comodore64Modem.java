public class Comodore64Modem extends Modem {

    public static void main(String[] args) {

        Comodore64Modem object = new Comodore64Modem();
        System.out.println(" ");
        object.speed = 300;
        object.displaySpeed();
        object.connect();

    }

        public void connect () {
            String method = "Polaczono z Comodore64Modem";
            System.out.println("Trwa laczenie do internetu ...");
            System.out.println(""+method);
        }
    }
