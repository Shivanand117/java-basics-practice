package  Loops;
import java.util.Scanner;

public class WaterBill {

    public static int calculateBill(int units) {

        int bill = 0;

        if (units <= 20) {

            bill = units * 5;

        } else if (units <= 40) {

            bill = (20 * 5)
                    + ((units - 20) * 7);

        } else if (units <= 100) {

            bill = (20 * 5)
                    + (20 * 7)
                    + ((units - 40) * 10);

        } else {

            bill = (20 * 5)
                    + (20 * 7)
                    + (60 * 10)
                    + ((units - 100) * 15);
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water units consumed: ");
        int units = sc.nextInt();

        int bill = calculateBill(units);

        System.out.println("Water Bill = ₹" + bill);

        sc.close();
    }
}