import java.util.Scanner;

public class MultipleChoiceQuiz {
    private static final String[] questions = {
            "What is the capital of Madhya Pradesh?",
            "Who first wrote Ramayana?",
            "What is the chemical formula of water?",
            "With how many states does Maharashtra shares boundary?",

    };
// we have added multiple choice with the answer using constructor
    private static final String[][] options = {
            {"A) Indore", "B) Jabalpur", "C) Bhopal", "D) Ujjain"},
            {"A) Tulsidas", "B) Valmiki", "C) Hanumanji", "D) Kalidasa"},
            {"A) H2O", "B) CO2", "C) O2", "D) NaCl"},
            {"A) 4", "B) 6","C) 8", "D) 3"},
    };

    private static final char[] correctAnswers = {'C', 'B', 'A','B'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Multiple Choice Quiz!");
        System.out.println("Choose the correct option for each question:");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers[i]);
            }
        }
  // After the choice it will declare the answer whether it is correct or not !
        System.out.println("\nQuiz ended!");
        System.out.println("Your score: " + score + " out of " + questions.length);
        scanner.close();
    }
}
