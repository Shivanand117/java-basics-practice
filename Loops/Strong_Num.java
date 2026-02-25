package Loops;

import java.util.Scanner;

public class Strong_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a  number : ");
        int n=sc.nextInt();

       
        int original=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            int fact=1;

       for(int i=1;i<=digit;i++){
         fact=fact*i;
       } 
       sum+=fact;
       n=n/10;
       }
       if(sum==original){
        System.out.println(original+" is a Strong Number");
       }
       else{
        System.out.println(original+" is not a Strong Number!");
       }
        
    }
}
