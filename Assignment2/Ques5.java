import java.util.Arrays;

public class Ques5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order

        int n = nums.length;

        // Calculate the maximum product of three largest numbers
        int maxProduct1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Calculate the maximum product of two smallest (negative) numbers and the largest number
        int maxProduct2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(maxProduct1, maxProduct2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Ques5 solution = new Ques5();
        int result = solution.maximumProduct(nums);
        System.out.println(result);
    }
}
