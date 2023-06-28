import java.util.Arrays;

public class Question1 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum to the sum of the first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer to the element next to nums[i]
            int right = nums.length - 1; // Pointer to the last element

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the current sum

                if (sum == target) {
                    return sum; // If the sum is equal to the target, return it
                }

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum; // Update the closest sum if the current sum is closer to the target
                }

                if (sum < target) {
                    left++; // If the current sum is less than the target, move the left pointer to the right
                } else {
                    right--; // If the current sum is greater than the target, move the right pointer to the left
                }
            }
        }

        return closestSum; // Return the closest sum found
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        Question1 solution = new Question1();
        int closestSum = solution.threeSumClosest(nums, target);

        System.out.println("Closest sum: " + closestSum);
    }
}
