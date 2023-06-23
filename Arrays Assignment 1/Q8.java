import java.util.Arrays;

import java.util.HashSet;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        long sum = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
            }
            set.add(num);
            sum += num;
        }

        int n = nums.length;
        int missing = (int) ((n * (n + 1) / 2) - (sum - duplicate));

        result[0] = duplicate;
        result[1] = missing;

        return result;
    }
}


public class Q8 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        Solution solution = new Solution();
        int[] result = solution.findErrorNums(nums);

        System.out.println("Duplicate and Missing Numbers: " + Arrays.toString(result));
    }
}
