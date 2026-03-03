package Arrays;

public class Frequency {
     public static void main(String[] args) {
        int arr[]={1,2,2,4,3,3,1};

        for(int i=0;i<arr.length;i++){
            boolean isalreadyCounted =false;

            //if element appears before it skips that vlaue only for skipping purpose we are using here
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                   isalreadyCounted=true;
                   break;
                }
            }
            if(isalreadyCounted)
                continue;
            int count=0;
            //count occurence of number means Frequency of number----->
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + "--> " + count + " times");

        }
     }
   
}
