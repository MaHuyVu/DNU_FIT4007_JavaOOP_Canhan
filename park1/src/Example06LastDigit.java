import java.util.Scanner;

public class Example06LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n % 10);
        System.out.println("Last digit = " + lastDigit);
    }
}
