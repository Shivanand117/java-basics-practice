package Collectons;
import java.util.*;

public class LongestSubstringg {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char currentChar = s.charAt(right);

            // If duplicate exists, remove characters from left
            while (set.contains(currentChar)) {

                set.remove(s.charAt(left));

                left++;
            }

            // Add current character
            set.add(currentChar);

            // Calculate current window length
            int currentLength = right - left + 1;

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);

        System.out.println("Longest Substring Length = " + result);
    }
}