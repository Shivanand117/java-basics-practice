package  Loops;
import java.util.Scanner;

public class Print_PrimeNo {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    System.out.println("The Numbers are: ");
    int sum=0;
    for(int i=2;i<=n;i++){
        boolean isPrime=true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(i);
            sum+=i;
        }   
     }   
    //  System.out.println("The sum is :");
    //System.out.println();
     System.out.printf("The sum is  %d",sum);

}
}
