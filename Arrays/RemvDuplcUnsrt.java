package Arrays;


public class RemvDuplcUnsrt {
    static boolean isDuplicated(int arr[]){
       
        int n=arr.length;
        boolean foundDuplicate=false;
        System.out.println("Arry affter removing duplicates is: ");
        for(int i=0;i<n;i++){
             boolean isduplicated=false;
             for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isduplicated=true;
                    break;
                }
             }
             if(!isduplicated){
                System.out.print(arr[i]+" ");
             }
        }
        return foundDuplicate;
    }
    public static void main(String[] args) {
        int arr[]={4,5,5,2,1,8,6};
        isDuplicated(arr);
        
    }
        
}


    

