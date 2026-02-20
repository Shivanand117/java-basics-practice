package Loops;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enteer a first number: ");
        int a=sc.nextInt();

        System.out.println("Enter second number: ");
        int b=sc.nextInt();

        int lcm=0;
        int Max=((a>b)?a:b);

        for(int i=Max; ;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.printf("The LCM of numbers is %d", lcm);
    }
}
