/*The Goal: You are given an array that goes UP and then comes DOWN (like a mountain).
For example: [0, 1, 3, 5, 10, 8, 2]. 
You need to find the index of the peak (the highest number, which is 10 at index 4). */
public class Peak {
    public static void main(String[] args) {
        System.out.println(peak(new int[] {0, 2, 1, 0}));
    }
    public static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(end > start) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                //dec
                end = mid;
            } else {
                //asc
                start = mid + 1;
            }
        }
        return start;
    }
}