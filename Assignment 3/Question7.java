import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> ranges = new ArrayList<>();
        
        // Handle the case where the array is empty
        if (nums.length == 0) {
            addRange(ranges, lower, upper);
            return ranges;
        }
        
        // Handle the missing range before the first element
        if (nums[0] > lower) {
            addRange(ranges, lower, nums[0] - 1);
        }
        
        // Handle the missing ranges between elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                addRange(ranges, nums[i - 1] + 1, nums[i] - 1);
            }
        }
        
        // Handle the missing range after the last element
        if (nums[nums.length - 1] < upper) {
            addRange(ranges, nums[nums.length - 1] + 1, upper);
        }
        
        return ranges;
    }
    
    private void addRange(List<List<Integer>> ranges, int start, int end) {
        List<Integer> range = new ArrayList<>();
        range.add(start);
        range.add(end);
        ranges.add(range);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        Question7 solution = new Question7();
        List<List<Integer>> missingRanges = solution.findMissingRanges(nums, lower, upper);

        System.out.println("Missing ranges: " + missingRanges);
    }
}
