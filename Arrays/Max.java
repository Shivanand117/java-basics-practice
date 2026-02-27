package Arrays;

public class Max {
    public static void main(String[] args) {
        int []a={1,45,87,98,45};
        int max=0;
        for ( int elemnt : a) {
            if(elemnt>max){
                max=elemnt;
            }
        }
        System.out.println("Maximum aarray element is: "+max);
    }
}


