package Arrays;

public class Remo_dupli_UnSorted_Arry {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,1};

        for(int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
