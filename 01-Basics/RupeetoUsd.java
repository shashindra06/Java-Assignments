import java.util.Scanner;

public class RupeetoUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();
        sc.close();
        double exchangeRate = 0.013; // 1 Rupee = 0.013 USD
        double dollars = rupees * exchangeRate;
        System.out.println(rupees + " Rupees is equal to " + dollars + " USD.");
    }
}
