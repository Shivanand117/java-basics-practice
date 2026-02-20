package Loops;

public class prgm1 {
    public static void main(String[] args) {
         int n=4;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    //prints first N even numbers sum
    int sum=0;
    int n1=4;
    for(int i=0;i<n1;i++)
        sum=sum+(2*i);
    System.out.println("the sum is:");
    System.out.println(sum);

    //multiplication of first n integers
    int n2=5;
    for(int i=1;i<=10;i++){
        System.out.printf("%d X %d = %d\n", n2,i,n2*i);
    }
    System.out.println();

    int n3=10;
    for(int i=10;i>=1;i--){
        System.out.printf("%d X %d =%d\n",n3,i,n3*i);
    }
    //factorial of number
    int n4=5;
    int fact=1;
    int i=1;
    while(i<=n4){
        fact=fact*i;
        i++;
    }
     System.out.println(fact);
     int n5=8;
     int sum1=0;
     
     for(int i1=1;i1<=10;i1++){
        sum1+=n5*i1;

     }
     System.out.println(sum1);
    }
}
