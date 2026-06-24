import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // When we find the match, immediately create and return the array
                    return new int[] { i, j };
                }
            }
        }
        // In Java, methods that promise to return an array MUST return something
        // even if the loop fails. Returning an empty array is standard practice here.
        return new int[0];
    }
}
