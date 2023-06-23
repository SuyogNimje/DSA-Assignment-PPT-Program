import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}

public class Q6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        Solution solution = new Solution();
        boolean result = solution.containsDuplicate(nums);

        System.out.println("Result: " + result);
    }
}
