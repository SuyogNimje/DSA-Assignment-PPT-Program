public class Question4 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found, return the index
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is greater, search in the right half
            } else {
                right = mid - 1; // Target is smaller, search in the left half
            }
        }

        return left; // Target not found, return the index where it would be inserted
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        Question4 solution = new Question4();
        int index = solution.searchInsert(nums, target);

        System.out.println("Index: " + index);
    }
}
