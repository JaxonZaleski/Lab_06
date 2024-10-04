import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {

        System.out.println("FuelCost");

        Scanner in = new Scanner(System.in);
        double gallonGas = 0.00;
        double milesPerGallon = 0.00;
        double fuelCost = 0.00;
        double milesDriving = 0.00;
        double costForMiles = 0.00;
        double gasDistance = 0.00;
        boolean done = false;

        do {
            System.out.println("Enter the exact gallons of gas your gas tank can hold.");
            if (in.hasNextDouble()) {
                gallonGas = in.nextDouble();
                done = true;
            } else {
                System.out.println("You entered an invalid value.");
            }
        } while (!done);
        do {
            System.out.println("Enter the fuel efficiency in miles per gallon.");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                done = true;
            } else {
                System.out.println("You entered the wrong value.");
            }
        } while (!done);
        do {
            System.out.println("Enter the price of gas per gallon.");
            if (in.hasNextDouble()) {
                fuelCost = in.nextDouble();
                done = true;
            } else {
                System.out.println("You entered the wrong value.");
            }
        } while (!done);
        System.out.println("The gallons of gas your tank can hold is " + gallonGas);
        System.out.println("The miles per gallon is " + milesPerGallon);
        System.out.println("The price of gas is $" + fuelCost);
        do {
            System.out.println("Enter how much miles you'll be driving.");
            if (in.hasNextDouble()) {
                milesDriving = in.nextDouble();
                done = true;
            } else {
                System.out.println("You entered a wrong value.");
            }
        } while (!done);
        costForMiles = milesDriving / milesPerGallon;
        costForMiles = costForMiles * fuelCost;
        System.out.println("This drive will cost $" + costForMiles);
        gasDistance = milesPerGallon * gallonGas;
        System.out.println("Your car can travel " + gasDistance + " miles");
    }
}
