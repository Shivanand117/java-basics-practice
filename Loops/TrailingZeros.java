package Loops;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int count=0;

        for(int i=5;i<=n;i*=5){
            count+=n/i;
        }
        System.out.println("Number of trailing zeros in " + n + "! is: " + count);


    }
}
