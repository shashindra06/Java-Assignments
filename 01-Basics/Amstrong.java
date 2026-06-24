import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to test: ");
        int i = sc.nextInt();
        sc.close();
        int res = 0;
        int b = i;
        while (i > 0) {
            int a = i % 10;
            res = res + a * a * a;
            i = i / 10;
        }
        if (b == res) {
            System.out.println("Amstrong");
        } else {
            System.out.println("Not Amstrong");
        }
    }
}
