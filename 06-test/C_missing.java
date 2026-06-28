import java.util.Arrays;

/*The Goal: Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array. */

public class C_missing {
    public static void main(String[] args) {
        System.out.println(miss2(new int[] { 3, 0, 1 }));
    }

    public static int miss(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    public static int miss2(int[] arr) {
        int n = arr.length;
        int expected_sum = (n * (n + 1)) / 2;
        int actual_sum = 0;
        for (int i = 0; i < n; i++) {
            actual_sum += arr[i];
        }
        return expected_sum - actual_sum;
    }
}
