import java.util.Scanner;

public class CheckUppercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is not an uppercase letter.");
        }
    }
}
