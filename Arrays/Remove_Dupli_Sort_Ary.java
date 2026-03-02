package Arrays;

public class Remove_Dupli_Sort_Ary {
    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 3};

        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("Array after remoing duplicates is: ");
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
