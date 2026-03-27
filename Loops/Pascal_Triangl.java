package Loops;
// 1
//121
//1331
//14441
//155551
public class Pascal_Triangl {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }//numbers
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print(1);
                }else{
                    System.out.print(i);
                }
            }
            for(int j=i-1;j>=1;j--){
                if(j==1){
                    System.out.print(1);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        
    }
}
