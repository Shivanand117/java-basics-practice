package  Sliding_Window;
import java.util.*;

public class SlidingWindowMaximumProbem{

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        int n = nums.length;

        int[] result = new int[n - k + 1];

        // Stores indexes
        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            // 1. Remove indexes that are outside the window
            while (!deque.isEmpty()
                    && deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            // 2. Remove smaller elements from the back
            while (!deque.isEmpty()
                    && nums[deque.peekLast()] <= nums[i]) {

                deque.pollLast();
            }

            // 3. Add current index
            deque.offerLast(i);

            // 4. Start recording answers
            // once the first window is complete
            if (i >= k - 1) {

                result[resultIndex] = nums[deque.peekFirst()];

                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        int[] result = maxSlidingWindow(nums, k);

        System.out.println("Maximum of each window:");

        System.out.println(Arrays.toString(result));
    }
}