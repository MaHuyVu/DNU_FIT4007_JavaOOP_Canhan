import java.util.Scanner;

public class CheckLowercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not a lowercase letter.");
        }
    }
}
