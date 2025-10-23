import java.util.Scanner;

public class Example10NextChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase character (a–y): ");
        char ch = sc.next().charAt(0);

        char next = (char)(ch + 1);
        System.out.println("Next character: " + next);
    }
}
