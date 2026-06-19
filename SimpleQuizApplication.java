import java.util.ArrayList;
import java.util.Scanner;

class Question {
    String question;
    String answer;

    Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
}

public class SimpleQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Question> quiz = new ArrayList<>();

        quiz.add(new Question(
                "1. What is the capital of India?\na) Mumbai\nb) Delhi\nc) Chennai\nd) Kolkata",
                "b"));

        quiz.add(new Question(
                "2. Which language is used for Java programming?\na) Python\nb) C\nc) Java\nd) HTML",
                "c"));

        quiz.add(new Question(
                "3. Which company developed Java?\na) Microsoft\nb) Sun Microsystems\nc) Google\nd) Apple",
                "b"));

        quiz.add(new Question(
                "4. Java is a ____ language.\na) Procedure-Oriented\nb) Object-Oriented\nc) Assembly\nd) Machine",
                "b"));

        quiz.add(new Question(
                "5. Which method is the entry point of a Java program?\na) start()\nb) run()\nc) main()\nd) execute()",
                "c"));

        quiz.add(new Question(
                "6. Which collection stores data dynamically?\na) Array\nb) ArrayList\nc) int\nd) String",
                "b"));

        quiz.add(new Question(
                "7. Which keyword is used to create a class?\na) class\nb) Class\nc) create\nd) object",
                "a"));

        quiz.add(new Question(
                "8. What is the size of int in Java?\na) 2 bytes\nb) 4 bytes\nc) 8 bytes\nd) 16 bytes",
                "b"));

        quiz.add(new Question(
                "9. Which operator is used for comparison?\na) =\nb) +\nc) ==\nd) %",
                "c"));

        quiz.add(new Question(
                "10. Which symbol is used for single-line comments?\na) //\nb) ##\nc) **\nd) @@",
                "a"));

        int score = 0;

        System.out.println("===== SIMPLE QUIZ APPLICATION =====");

        for (Question q : quiz) {

            System.out.println("\n" + q.question);
            System.out.print("Enter your answer: ");

            String userAnswer = sc.next().toLowerCase();

            if (userAnswer.equals(q.answer)) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
            }
        }

        System.out.println("\n===== QUIZ COMPLETED =====");
        System.out.println("Your Score: " + score + "/" + quiz.size());

        sc.close();
    }
}
