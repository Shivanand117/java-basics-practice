package  Collectons;
import  java.util.*;

public class MinimumWindowSubstrring {

    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> required = new HashMap<>();

        // Count characters required from t
        for (char ch : t.toCharArray()) {
            required.put(ch, required.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        int formed = 0;
        int requiredCount = required.size();

        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // Character requirement satisfied
            if (required.containsKey(ch)
                    && window.get(ch).intValue() == required.get(ch).intValue()) {

                formed++;
            }

            // Try shrinking the window
            while (left <= right && formed == requiredCount) {

                char leftChar = s.charAt(left);

                int currentLength = right - left + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                    minLeft = left;
                }

                window.put(
                    leftChar,
                    window.get(leftChar) - 1
                );

                if (required.containsKey(leftChar)
                        && window.get(leftChar) < required.get(leftChar)) {

                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minLeft, minLeft + minLength);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = minWindow(s, t);

        System.out.println("Minimum Window = " + result);
    }
}