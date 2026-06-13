package Arrays;

public class ThirdMin {
    public static void main(String[] args) {
        int arr[]= {8, 2, 5, 1, 9, 3};
        int first=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<first){
                third=sec;
                sec=first;
                first=num;
            }else if(num<sec){
                third=sec;
                sec=num;
            }else if(num<third){
                third=num;
            }
        }
        System.out.println("Third Minimum value is: "+ third);
    }
}
