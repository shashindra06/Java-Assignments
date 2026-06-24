import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        for (int i = start; i <= end; i++) {
            if (primen(i))
                System.out.println(i);
        }
    }

    public static boolean primen(int a) {
        if (a > 1) {
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        } else
            return false;
    }
}