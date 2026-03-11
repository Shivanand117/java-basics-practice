package Methods;

public class Find_AVG {
    static double findAvg(int...numbers){
        int sum=0;
        for (int element : numbers) {
            sum +=element;
        }
        return (double)sum/numbers.length;
    }
    public static void main(String[] args) {
        System.out.println(findAvg(10,20,30,40,50));
}
}