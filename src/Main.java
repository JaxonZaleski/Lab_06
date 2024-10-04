import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("CtoFConverter");

        Scanner in = new Scanner(System.in);
        double celsius = 0.00;
        double fahrenheit = 0.00;
        boolean done=false;

        do {
            System.out.println("Enter the celsius (full number) you want to convert.");
            if(in.hasNextDouble()) {
                celsius = in.nextDouble();
                fahrenheit = (9.0 / 5) * celsius + 32;
                done=true;
            } else {
                System.out.println("You have entered an invalid value.");
                in.nextLine();
            }
        } while (!done);
        System.out.println("The fahrenheit is " + fahrenheit);
    }
}