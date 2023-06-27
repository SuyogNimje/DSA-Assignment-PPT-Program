import java.util.HashSet;

public class Ques2 {
    public int maxDifferentCandies(int[] candyType) {
        int maxCandies = candyType.length / 2; // Maximum number of candies Alice can eat
        HashSet<Integer> uniqueCandies = new HashSet<>();
        
        for (int candy : candyType) {
            uniqueCandies.add(candy); // Add each candy type to the set
            if (uniqueCandies.size() == maxCandies) {
                break; // Stop adding candies once the limit is reached
            }
        }
        
        return uniqueCandies.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        Ques2 solution = new Ques2();
        int result = solution.maxDifferentCandies(candyType);
        System.out.println(result);
    }
}
