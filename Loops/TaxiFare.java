package  Loops;

import java.util.Scanner;

public class TaxiFare {

    public static double calculateFare(double distance) {

        double fare = 0;

        if (distance <= 5) {

            fare = distance * 10;

        } else if (distance <= 15) {

            fare = (5 * 10)
                    + ((distance - 5) * 8);

        } else if (distance <= 35) {

            fare = (5 * 10)
                    + (10 * 8)
                    + ((distance - 15) * 6);

        } else {

            fare = (5 * 10)
                    + (10 * 8)
                    + (20 * 6)
                    + ((distance - 35) * 5);
        }

        return fare;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled: ");
        double distance = sc.nextDouble();

        double fare = calculateFare(distance);

        System.out.println("Distance = " + distance + " km");
        System.out.println("Taxi Fare = ₹" + fare);

        sc.close();
    }
}