public class Main {

    public static void main(String[] args) {


      int[][] student = new int[6][6];
      int[] kuba = {90,85,85,70,80,90};
      int[] martyna = {90,90,90,85,70,80};
      int[] michal = {70,70,70,80,60,75};
      int[] nikola = {65,60,70,50,60,40};
      int[] mikolaj = {90,80,90,80,80,95};
      int[] katarzyna = {95,95,95,95,90,90};

      student[0] = kuba;
      student[1] = martyna;
      student[2] = michal;
      student[3] = nikola;
      student[4] = mikolaj;
      student[5] = katarzyna;

      int sumaOcen = 0;
      int[] sumaStudentow = new int[6];
      for (int i = 0; i<6;i++) {
          System.out.println("Student #" +i);
          sumaStudentow[i] =0;
          for (int j = 0; j<6;j++) {
              sumaOcen = sumaOcen + student[i][j];
              sumaStudentow[i] = sumaStudentow[i] + student[i][j];
          }
          System.out.println("Srednia ocen:" + sumaStudentow[i] / 6);
          }
          System.out.println("\nSrednia ocen wszystkich studentow:"+sumaOcen /36);

    }
}
