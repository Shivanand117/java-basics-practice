package Arrays;

public class Find_Duplicate {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,2,3,4,5,8,9,8 };

        for(int i=0;i<arr.length;i++){
            boolean isalrdyPrinted =false;
//it checks whethe this number is already printed before or not 
        for(int k=0;k<i;k++){
            if(arr[i]==arr[k]){
                isalrdyPrinted=true;
                break;
            }
        }
        if(isalrdyPrinted)
            continue;

        //it checks duplicate in remaining array 
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]+" ");
                break;
            }
        }
        }
    }
}
