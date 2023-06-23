import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZero];
                nums[nonZero] = temp;
                nonZero++;
            }
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        System.out.println("Modified nums: " + Arrays.toString(nums));
    }
}
