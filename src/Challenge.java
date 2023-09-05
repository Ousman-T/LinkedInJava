import java.util.Scanner;

public class Challenge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What year was Java made?");
        System.out.println("A - 1988");
        System.out.println("B - 1995");
        System.out.println("C - 2000");
        String answer = input.next();

        if (answer.equalsIgnoreCase("B")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong Answer, correct answer was B!");
        }
    }
}
