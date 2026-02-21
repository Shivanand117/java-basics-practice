package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number range of Fibonacci Series: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        if(n==0){
            System.out.println(n);
        }
        for(int i=0;i<n;i++){
            System.out.print(a +" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
