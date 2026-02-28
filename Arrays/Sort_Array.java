package Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3,8,9,6,10};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element+" ");
            
        }
    }
}
