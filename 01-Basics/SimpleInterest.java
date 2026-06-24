import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the time in years: ");
        int time = sc.nextInt();
        sc.close();
        float simple_interest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + simple_interest);
    }
}