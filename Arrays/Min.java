package Arrays;

public class Min {
    public static void main(String[] args) {
        int []a={14,54,4,1,8,56,0,-1};
        int min=a[0];
        for (int e : a) {
            if(e<min){
                min=e;
            }
        }
        System.out.println(min);
    }
}
