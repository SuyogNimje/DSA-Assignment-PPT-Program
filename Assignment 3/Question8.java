import java.util.Arrays;

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Check for overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i-1][1]) {
                return false;
            }
        }

        return true;
    }
}

// Test the function with the example input
public class Question8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean canAttend = solution.canAttendMeetings(intervals);
        System.out.println(canAttend);
    }
}
