package Arrays;

public class Sort_ArrayChck {
    public static void main(String[] args) {
        int arr[]={1,5,3,7,8,85};
        boolean isSorted =true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is Sorted...");
        }else{
            System.out.println("The Array is Not sorted!");
        }
    }
}
