import java.util.Arrays;

public class D_merge {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        System.out.println(Arrays.toString(merge2(arr1, 3, arr2, 3)));

    }

    public static int[] merge(int[] arr1, int m1, int[] arr2, int m2) {
        int j = 0;
        for (int i = m1; i < arr1.length; i++) {
            arr1[i] = arr2[j++];
        }
        Arrays.sort(arr1);
        return arr1;
    }

    public static int[] merge2(int[] arr1, int m1, int[] arr2, int m2) {
        int pointer = m1 + m2 - 1;
        while (m1 > 0 && m2 > 0) {
            if (arr1[m1 - 1] >= arr2[m2 - 1]) {
                arr1[pointer] = arr1[m1 - 1];
                m1--;
            } else {
                arr1[pointer] = arr2[m2 - 1];
                m2--;
            }
            pointer--;
        }
        while (m2 > 0) {
            arr1[pointer] = arr2[m2 - 1];
            m2--;
            pointer--;
        }
        return arr1;
    }

}