public class Ques8 {
    public int minimumScore(int[] nums, int k) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        // Find the initial minimum and maximum elements
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }

        // Update the minimum and maximum elements using the operation
        minNum += k;
        maxNum -= k;

        return Math.max(0, maxNum - minNum);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        Ques8 solution = new Ques8();
        int result = solution.minimumScore(nums, k);
        System.out.println(result);
    }
}
