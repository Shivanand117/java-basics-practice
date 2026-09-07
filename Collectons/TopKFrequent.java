package  Collectons;
import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {

      
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

      
        List<Integer> list = new ArrayList<>(map.keySet());

     
        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }
}