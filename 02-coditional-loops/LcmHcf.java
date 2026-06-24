import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for finding hcf and lcm of them: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        long lcm = ((long) num1 * num2) / a;
        System.out.println("LCM and HCF are :" + lcm + " " + a);
    }
}