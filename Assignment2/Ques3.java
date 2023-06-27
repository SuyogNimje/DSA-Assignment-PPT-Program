import java.util.HashMap;
import java.util.Map;

public class Ques3 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int longestSubsequenceLength = 0;
        
        // Count the frequency of each number
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Check for harmonious subsequences
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(num + 1)) {
                int subsequenceLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
                longestSubsequenceLength = Math.max(longestSubsequenceLength, subsequenceLength);
            }
        }
        
        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Ques3 solution = new Ques3();
        int result = solution.findLHS(nums);
        System.out.println(result);
    }
}
