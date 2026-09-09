package  Collectons;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        // Create HashSet
        Set<Integer> numSet = new HashSet<>();

        // Add all array elements to HashSet
        for (int num : nums) {
            numSet.add(num);
        }

        // Store the longest sequence length
        int longest = 0;

        // Check every number
        for (int num : numSet) {

            // Check whether this number is the starting point
            if (!numSet.contains(num - 1)) {

                // Current sequence length
                int length = 1;

                // Check next consecutive numbers
                while (numSet.contains(num + length)) {
                    length++;
                }

                // Update longest sequence
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length = " + result);

        sc.close();
    }
}