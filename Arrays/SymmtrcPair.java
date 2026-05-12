package Arrays;

public class SymmtrcPair {
    static void symtricPair(int arr[][]){
        int n=arr.length;
        System.out.println("Symmetric Pairs are: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    System.out.println("(" +
                        arr[i][0] + "," +
                        arr[i][1] + ")");
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2}, 
                    {3, 4},
                    {5, 9},
                    {4, 3},
                    {9, 5}};
        symtricPair(arr);
    }
}
