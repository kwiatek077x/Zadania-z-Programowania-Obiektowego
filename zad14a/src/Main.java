public class Main {

    public static void main(String[] args) {

        int score = 0;
        int grade = 10;
        int answer = 17;
	int correctAnswer = 13;

	switch (answer >= correctAnswer){
	   case : score +=10;
	    System.out.println("Odpowiedz poprawna .Zdobyles 10 punktow");

	    score -=5;
	    System.out.println("Niestety,odpowiedz nieprawidlowa.Tracisz 5 punktow");
	    case:(grade <= correctAnswer)
        System.out.println("Otrzymujesz ocene A.");
        break;
    case: (grade == correctAnswer)
        System.out.println("Otrzymujesz ocene B.");
        break;
    case: (grade == answer)
        System.out.println("Otrzymujesz ocene C.");
    break;
       case: (grade > answer)
               System.out.println("Otrzymuejesz ocene F.");
    break;
	}
    }
}
