package Methods;

public class Multiplictn {
    static void  multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d=%d", n,i,n*i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        multiplication(7);
    }
}
