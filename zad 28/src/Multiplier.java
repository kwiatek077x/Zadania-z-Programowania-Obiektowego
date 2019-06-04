import java.util.Scanner;

public class Multiplier {


    public static void main(String[] agruments) {
        float sum=3;

        Scanner scan = new Scanner(System.in);
        //  String[] arguments;
        System.out.println("Wprowadz liczby");
        int i = scan.nextInt();
        int f = scan.nextInt();
        int b = scan.nextInt();
        for (String argument : agruments) {
            try {
                sum = sum + Float.parseFloat(argument);

            } catch (NumberFormatException e) {
                System.out.println(argument + " nie jest liczba");
                throw e;
            }
        }
        System.out.println("Suma podanych liczb wynosi " + sum);

    }
}

