package OOPS;

public class Robber_Money {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        if(arr.length==2){
            System.out.println(Math.max(arr[0], arr[1]));
        }
        int previsval=0;
        int currval=0;
//exclide last house
        for(int i=0;i<=arr.length-2;i++){
            int temp=Math.max(currval, previsval+arr[i]);
            previsval=currval;
            currval=temp;
        }
         int previsval_2=0;
        int currval_2=0;
//exclude first house
        for(int i=1;i<=arr.length-1;i++){
            int temp=Math.max(currval_2, previsval_2+arr[i]);
            previsval_2=currval_2;
            currval_2=temp;
        }
        System.out.println(Math.max(currval, currval_2));

    }
}
