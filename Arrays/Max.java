package Arrays;

public class Max {
    public static void main(String[] args) {
        int []a={1,45,87,98,100};
        int max=a[0];

        for(int i=0;i<=a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

//         for ( int elemnt : a) {
//             if(elemnt>max){
//                 max=elemnt;
//             }
//         }
//         System.out.println("Maximum aarray element is: "+max);
  }
 }


