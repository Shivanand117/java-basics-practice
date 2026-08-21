package  Collectons;

import java.util.Scanner;

public class MissingNum {

    public static int findMissingNumber(int[] arr) {

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMissingNumber(arr);

        System.out.println("Missing Number = " + result);

        sc.close();
    }
}