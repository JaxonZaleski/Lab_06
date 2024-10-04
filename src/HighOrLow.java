import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {

        System.out.println("HighOrLow");

        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int oneToTen = rand.nextInt(1,11);
        int guess = 0;
        do {
            System.out.println("Guess a number [1-10] or type -1 to stop.");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess > oneToTen && guess < 11) {
                    System.out.println("The number is " + oneToTen);
                    System.out.println("Your guess is too high.");
                } else if (guess == oneToTen) {
                    System.out.println("The number is " + oneToTen);
                    System.out.println("You guessed right.");
                } else if (guess < oneToTen && guess > 0){
                    System.out.println("The number is " + oneToTen);
                    System.out.println("Your guess is too low.");
                } else if (guess == -1){
                    System.out.println("No one ever wants to play with me. T_T");
                } else {
                    System.out.println("You entered in a wrong value");
                }
                oneToTen = rand.nextInt(1, 11);
            } else {
                System.out.println("You entered in a wrong value.");
                in.nextLine();
            }
            oneToTen = rand.nextInt(1,11);
        } while (guess != -1);
    }
}
