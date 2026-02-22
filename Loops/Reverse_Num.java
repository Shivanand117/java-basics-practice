package Loops;

import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();

        int rev=0;

        while (n!=0) {
            rev=rev*10+(n%10);
            n/=10; 
        }
        System.out.println("The reveresd Number is : "+rev);
    }
}
