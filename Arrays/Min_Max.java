package Arrays;

public class Min_Max {
    public static void main(String[] args) {
        int arr[]={5, 2, 8, 1, 9, 3};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            //minimum
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum value in array: "+min);
        System.out.println("Maximun value in an array is : "+max);
    }
}
