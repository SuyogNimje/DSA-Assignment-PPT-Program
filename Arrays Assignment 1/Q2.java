import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}


public class Q2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution solution = new Solution();
        int result = solution.removeElement(nums, val);

        System.out.println("Result: " + result);
        System.out.println("Modified nums: " + Arrays.toString(nums));
    }
}
