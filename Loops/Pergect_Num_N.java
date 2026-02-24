package Loops;

import java.util.Scanner;

public class Pergect_Num_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number n: ");
        int n=sc.nextInt();
        System.out.println("The perfect Numbers up to "+ n + "  are ");
        for(int num=1;num<=n;num++){
            int sum=0;
            for(int i=1;i<=num/2;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
            if(sum==num && num!=0){
                System.out.println(num);
            }
        }
    }
}
