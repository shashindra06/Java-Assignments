import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long i = in.nextLong();
        if (i % 2 != 0) System.out.println("Odd");
        else System.out.println("even");
        in.close();
    }
}