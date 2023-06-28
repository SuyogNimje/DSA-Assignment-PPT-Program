import java.util.Arrays;

public class Question5 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment the digit
                return digits; // Return the modified array
            }

            digits[i] = 0; // Set the digit to 0 as it becomes 10
        }

        // If we reach here, all digits are 9, so we need an additional digit 1 at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        Question5 solution = new Question5();
        int[] result = solution.plusOne(digits);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
