package Loops;

import java.util.Scanner;

public class Multiple_of_3_count {
    public static void main(String[] args) {
        // for(int Counter=0;Counter<10;Counter=Counter+1){
        //     System.out.println("Hello world");
        // }

        //     int i=0;
        //     do { 
        //         System.out.println("Hii Java");
        //         i=i+1;
        //     } while (i<2);
        //1
         Scanner sc=new Scanner(System.in);
        System.out.println("Enteer a number:");
         int n=sc.nextInt();
         int sum=0;
         int count=0;
        // for(int i=0;i<=n;i++){
        //  //   if(i%2==0){
        //         sum=sum+(2*i-1);//for even 
        // //}
        // }
        //    System.out.print(sum);
           for(int i=1;i<=n;i++)
            if(i%3==0){
                count++;
            }
        System.out.println(count);
    }
}
