import java.util.Scanner;

public class Minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("Maximum among 3 numbers entered is : " + Max(a, b, c));
        System.out.println("Mininmum among 3 numbers entered is : " + Min(a, b, c));
    }

    public static int Max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else if (c > a && c > b)
            return c;
        else
            return a;
    }

    public static int Min(int a, int b, int c) {
        if (a < b && a < c)
            return a;
        else if (b < a && b < c)
            return b;
        else if (c < a && c < b)
            return c;
        else
            return a;
    }
}
