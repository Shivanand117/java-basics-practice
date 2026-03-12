package Arrays;
public class Mat_Add{
    public static void main(String[] args) {
        int [][]M1={{1,2},{3,4}};
        int [][]M2={{1,4},{2,5}};

        for(int i=0;i<M1.length;i++){
            for(int j=0;j<M1[i].length;j++){
                System.out.print(M1[i][j]+M2[i][j]+" ");
            }
            System.out.println();
        }
    }
}

