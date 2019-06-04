import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner we = new Scanner(System.in);

        float min = Integer.MAX_VALUE;
        float max = Integer.MIN_VALUE;

        System.out.println("Podaj ile liczb: ");
        int n = we.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Podaj liczbe: ");
            float liczba = we.nextInt();

            if (liczba < min) {
                min = liczba;
            }
            if (liczba > max) {
                max = liczba;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}