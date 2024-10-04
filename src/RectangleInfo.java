import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        System.out.println("RectangleInfo");

        Scanner in = new Scanner(System.in);
        double length = 0.00;
        double width = 0.00;
        double area = 0.00;
        double perimeter = 0.00;
        double hypotenuse = 0.00;
        boolean done = false;

        do {
            System.out.println("Enter in the value for length.");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                System.out.println("Enter the value for width.");
                if (in.hasNextDouble()) {
                    width = in.nextDouble();
                    done = true;
                } else {
                    System.out.println("You entered the wrong value.");
                }
            } else {
                System.out.println("You entered in the wrong value.");
            }
        } while (!done);
        area = length * width;
        System.out.println("The area is " + area);
        perimeter = area * 2;
        System.out.println("The perimeter is " + perimeter);
        hypotenuse = (length * length) + (width * width);
        System.out.println("The hypotenuse is " + Math.sqrt(hypotenuse));
    }
}
