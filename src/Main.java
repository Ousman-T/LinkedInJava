import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10.");
        int number = input.nextInt();
        if(number < 5)
            System.out.println("Enjoy the good luck a friend brings you!");
        else
            System.out.println("Your shoe selection will make you happy today!");

        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat){
            System.out.println("Playing current song!");
            System.out.println("Take song off repeat? If so answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song.");
    }
}
