package Arrays;

public class Find_Index {
    public static void main(String[] args) {
        int arr[] = {4, 8, 2, 9, 5};
        int key = 2;

        int index = -1;  

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;  
            }
        }

        if(index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}