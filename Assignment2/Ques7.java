public class Ques7 {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isIncreasing = false;
            }

            if (nums[i] < nums[i + 1]) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        Ques7 solution = new Ques7();
        boolean result = solution.isMonotonic(nums);
        System.out.println(result);
    }
}
