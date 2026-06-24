import java.util.Scanner;

public class Sumuntilzero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers to find sum of them to end enter 0 : ");
        int test = sc.nextInt();
        long result = 0;
        while(test!=0){
            result += test;
            test = sc.nextInt();
        }
        sc.close();
        System.out.println("Answer: "+result);
    }
}