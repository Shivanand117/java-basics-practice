package  Arrays;
import java.util.Scanner;

public class MaxSubarrray {

    // Method to find the maximum subarray sum
    public static int maxSubArray(int[] nums) {

        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Either start a new subarray or extend the current one
            current = Math.max(nums[i], current + nums[i]);

            // Update the maximum sum found so far
            max = Math.max(max, current);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);

        sc.close();
    }
}