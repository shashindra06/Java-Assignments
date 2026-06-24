import java.util.Scanner;
import java.util.Arrays;

public class Accumulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 4 digits: ");
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(arr) + "\nAccumulated array: " + Arrays.toString(acc(arr)));
        System.out.println(Arrays.toString(arr) + "\nPermuted array: " + Arrays.toString(permutation(arr)));
    }

    public static int[] acc(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            b[i] += b[i - 1] + a[i];
        }
        return b;
    }

    public static int[] permutation(int[] a) {
        int[] pa = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            pa[i] = a[a[i]];
        }
        return pa;
    }
}