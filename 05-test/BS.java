
public class BS {
    public static void main(String[] args) {
        int[] a = { -1, 0, 3, 5, 9, 12 };
        System.out.println(search1(a, 9));
        int[] b = { 1, 3, 5, 6 };
        System.out.println(search2(b, 2));
        System.out.println(search4(new char[] { 'c', 'f', 'j' }, 'a'));
        System.out.println(search3(4));
    }

    public static int search1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static int search2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return start;
    }

    /*
     * You are a product manager and currently leading a team to develop a new
     * product.
     * Unfortunately, the latest version of your product fails the quality check.
     * Since each version is developed based on the previous version,
     * all the versions after a bad version are also bad.
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
     * bad one.
     * You are given an API boolean isBadVersion(int version)
     * which returns whether version is bad.
     */

    public static int search3(int end) {
        int start = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean isBadVersion(int a) {
        if (a > 3) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * The Goal: Given a characters array letters that is sorted in non-decreasing
     * order and a character target, return the smallest character in the array that
     * is strictly larger than target. If no such character exists, return the first
     * character in the array.
     */
    public static char search4(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
