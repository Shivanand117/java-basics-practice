package  Arrays;
import java.util.Scanner;

public class BinaryExponentiation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        long a = sc.nextLong();

        System.out.print("Enter exponent: ");
        long n = sc.nextLong();

        long answer = 1;

        while (n > 0) {

            if (n % 2 == 1) {
                answer = answer * a;
            }

            a = a * a;
            n = n / 2;
        }

        System.out.println("Power = " + answer);
    }
}