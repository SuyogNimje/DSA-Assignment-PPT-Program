import java.util.Arrays;

public class Ques1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int sum = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Sum the minimum value in each pair
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        Ques1 solution = new Ques1();
        int result = solution.arrayPairSum(nums);
        System.out.println(result);
    }
}
