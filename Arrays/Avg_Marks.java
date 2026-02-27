package Arrays;

public class Avg_Marks {
    public static void main(String[] args) {
        float [] marks={45.f,78.5f,87.5f,89.5f,78.5f,89.5f};
        float sum=0;
        for (float elem : marks) {
            sum+=elem;
        }
        System.out.println("The Avg Marks of the given mark are "+sum/marks.length+"%");
    }
}
