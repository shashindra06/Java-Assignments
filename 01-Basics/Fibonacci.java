import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("How many number of sequences required: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("\n" + a + " " + b + " ");
        for (int i = 0; i < (n - 2); i++) {
            int s = a + b;
            System.out.print(s + " ");
            a = b;
            b = s;
        }
    }
}