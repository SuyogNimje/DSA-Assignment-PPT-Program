public class Question6 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // Perform bitwise XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        Question6 solution = new Question6();
        int single = solution.singleNumber(nums);

        System.out.println("Single number: " + single);
    }
}
