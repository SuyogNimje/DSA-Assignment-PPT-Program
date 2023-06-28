import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        int n = nums.length;
        if (n < 4) {
            return quadruplets; // Return an empty list if the array has less than 4 elements
        }

        Arrays.sort(nums); // Sort the array in ascending order

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate values for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1; // Pointer to the element next to nums[j]
                int right = n - 1; // Pointer to the last element

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right]; // Calculate the current sum

                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); // Add the quadruplet to the result
                        left++;
                        right--;

                        // Skip duplicate values for the third and fourth elements
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++; // If the current sum is less than the target, move the left pointer to the right
                    } else {
                        right--; // If the current sum is greater than the target, move the right pointer to the left
                    }
                }
            }
        }

        return quadruplets; // Return the list of unique quadruplets
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        Question2 solution = new Question2();
        List<List<Integer>> quadruplets = solution.fourSum(nums, target);

        System.out.println("Quadruplets: " + quadruplets);
    }
}
