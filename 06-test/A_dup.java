import java.util.Arrays;

public class A_dup {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1 };
        Arrays.sort(arr);
        System.out.println(dupli(arr));
    }

    public static boolean dupli(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean s = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    s = false;
                }
            }
            if (s) {
                break;
            }
        }
        return arr;
    }

    public static int[] insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
        return arr;
    }

    public static int getmaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int large = getmaxindex(arr, 0, arr.length - i);
            swap(arr, large, arr.length - 1 - i);
        }
        return arr;
    }
}