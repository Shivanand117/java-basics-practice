package Methods;

public class Fibonci_Num {
    static  int fibnocci(int n){
        if(n==1 || n==2){
            return n-1;
        }else{
        return fibnocci(n-1)+fibnocci(n-2);
    }}
    public static void main(String[] args) {
        System.out.println(fibnocci(7));
        
    }
}
