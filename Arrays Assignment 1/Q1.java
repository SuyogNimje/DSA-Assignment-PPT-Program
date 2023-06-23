import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

public class Q1 {
        public static void main(String[] args) {
            int[] nums = {1,4,5, 7, 11, 15};
            int target = 9;
    
            Solution solution = new Solution();
            int[] result = solution.twoSum(nums, target);
    
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    
}
