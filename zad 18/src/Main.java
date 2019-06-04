public class Main {

    public static void main(String[] args) {
        int[] trzynastki = new int[400];
        int liczba = 0;
        int liczbaZnaleziona = 1;

        while (liczba < 400) {
            if (liczbaZnaleziona % 13 == 0) {
                trzynastki[liczba] = liczbaZnaleziona;
                liczba++;
            }
            liczbaZnaleziona++;
        }
        System.out.println(" Pierwsze 400 liczb wielokrotnosci 13: ");
        for (int i = 0; i < 400; i++) {
            System.out.println(trzynastki[i] + " ");
        }
    }
}

