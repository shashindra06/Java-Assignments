import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to check is it vowel: ");
        String s = sc.next();
        sc.close();
        char[] c = s.toCharArray();
        int i = 0;
        for (char d : c) {
            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' || d == 'A' || d == 'E' || d == 'I' || d == 'O'
                    || d == 'U') {
                i++;
            } else {
                System.out.println("Consonant");
                break;
            }
        }
        if (i == c.length) {
            System.out.println("Vowel");
        }
    }
}
