package Loops;

import java.util.Scanner;

public class Power_Base {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base:");
        int base=sc.nextInt();

        System.out.println("Enter a exponent:n");
        int exp=sc.nextInt();

        int result=1;

        for(int i=1;i<=exp;i++){
            result=result*base;
        }
        System.out.println(base + "^" + exp + " = " + result);
    }
}
