import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        sc.close();
        switch (operator) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
        }
    }
}
