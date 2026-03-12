package Arrays;

public class Transfose_Mat {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
        int b[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[j][i]=a[i][j];
            }
        }
    //    System.out.println(b[j][i]);
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
