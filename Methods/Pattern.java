package Methods;

public class Pattern {
    static void printpatt(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printpatt(5);
        
    }
}
