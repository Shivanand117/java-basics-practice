package Arrays;

public class BubblSort {
    public static void main(String[] args) {
           int arr[] = {5, 2, 8, 1, 9, 3};

           for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array is: ");
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
