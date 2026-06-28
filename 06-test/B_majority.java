import java.util.Arrays;

/*The Goal: Given an array nums of size n, return the majority element. 
The majority element is the element that appears more than n / 2 times. 
You may assume that the majority element always exists in the array. */

public class B_majority {
    public static void main(String[] args) {
        System.out.println(major2(new int[] { 2, 2, 1, 1, 1, 2, 2, 1, 1 }));
    }

    public static int major(int[] arr) { // fails for edge case
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count += 1;
            } else {
                count = 1;
            }
            if (count == (arr.length / 2) + 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int major2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}
