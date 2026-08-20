package  Collectons;
import java.util.*;

public class WordLadder {

    public static int ladderLength(
            String beginWord,
            String endWord,
            List<String> wordList) {

        HashSet<String> set = new HashSet<>(wordList);

        // If endWord doesn't exist, transformation is impossible
        if (!set.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();

        queue.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Process one level at a time
            for (int i = 0; i < size; i++) {

                String current = queue.poll();

                char[] chars = current.toCharArray();

                // Change each character
                for (int j = 0; j < chars.length; j++) {

                    char original = chars[j];

                    for (char c = 'a'; c <= 'z'; c++) {

                        if (c == original) {
                            continue;
                        }

                        chars[j] = c;

                        String next = new String(chars);

                        // Found destination
                        if (next.equals(endWord)) {
                            return level + 1;
                        }

                        // If valid and not visited
                        if (set.contains(next)) {

                            queue.add(next);

                            // Remove immediately to prevent revisiting
                            set.remove(next);
                        }
                    }

                    chars[j] = original;
                }
            }

            level++;
        }

        return 0;
    }

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = Arrays.asList(
                "hot",
                "dot",
                "dog",
                "lot",
                "log",
                "cog"
        );

        int result = ladderLength(
                beginWord,
                endWord,
                wordList
        );

        System.out.println("Shortest Transformation Length = " + result);
    }
}