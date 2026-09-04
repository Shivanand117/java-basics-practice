package Loops;

import java.util.Scanner;

public class ShoppingBill {
    public static double calculateDiscount(double amount){
        double discount;

        if(amount<=1000){
            discount=0;
        }
        else if(amount<=5000){
             discount=amount*0.10;
        }else if(amount<=10000){
            discount=amount*0.20; 
        }
        else{
            discount=amount*0.30;
        }
        return  discount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double amount=sc.nextDouble();

        double discount=calculateDiscount(amount);

        double finalamount=amount-discount;

        System.out.println("Original Amount=₹ "+ amount);
        System.out.println("Discount =₹ " + discount);
        System.out.println("Final Amount =₹ "+ finalamount );

        sc.close();
    }
}
