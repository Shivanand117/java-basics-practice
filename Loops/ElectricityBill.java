package  Loops;
import java.util.Scanner;

public class ElectricityBill {

    public static double calculateBill(int units) {

        double bill = 0;

        if (units <= 100) {

            bill = units * 2;

        } else if (units <= 200) {

            bill = (100 * 2)
                    + ((units - 100) * 3);

        } else if (units <= 400) {

            bill = (100 * 2)
                    + (100 * 3)
                    + ((units - 200) * 5);

        } else {

            bill = (100 * 2)
                    + (100 * 3)
                    + (200 * 5)
                    + ((units - 400) * 7);
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = sc.nextInt();

        double bill = calculateBill(units);

        System.out.println("Electricity Bill = ₹" + bill);

        sc.close();
    }
}