package Loops;
import java.util.Scanner;

public class Sum_OddNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numer range");
        int n=sc.nextInt();
        int sum=n*n;
        // for(int i=1;i<=n;i++){
        //     sum+=(2*i-1);//O(n)-- is the time complexity
        // }
        System.out.println("the sum of first n odd numbers is: "+sum);
    }
}
