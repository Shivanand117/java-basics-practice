package Arrays;
public class HarshadNumber {

    static boolean isHarshad(int num){

        int sum = 0;
        int temp = num;

        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {

        int num = 18;

        if(isHarshad(num)){
            System.out.println(num + " is a Harshad number");
        } else{
            System.out.println(num + " is NOT a Harshad number");
        }
    }
}