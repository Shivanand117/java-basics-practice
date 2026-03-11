package Arrays;
import java.util.*;
public class Matrix_Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]m1=new int[2][2];
        int [][]m2=new int[2][2];
        int [][]m3=new int[2][2];
        System.out.println("Enter first Matrix elements: ");

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[0].length;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix elemts: ");
        for(int i=0;i<m2.length;i++){
            for(int j=0;j<m2[0].length;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        //This adds the matrix from both m1 and m2
        System.out.println("Addition of Matrix is: ");
         for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[0].length;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        //Dispalys the matrix of addition
         for(int i=0;i<m3.length;i++){
            for(int j=0;j<m3[0].length;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
