import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to test was that a perfect number or not: ");
        int p = sc.nextInt();
        sc.close();
        int res = 1;
        for (int i = 2; i <= (p / 2); i++) {
            if (p % i == 0) {
                res += i;
            }
        }
        if (res == p && p >= 2)
            System.out.println("Perfect number");
        else
            System.out.println("Not a Perfect number");
    }
}