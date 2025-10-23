import java.util.Scanner;

public class CheckDivisorAndMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % b == 0 && b % c == 0) {
            System.out.println("b is both a divisor of a and a multiple of c.");
        } else {
            System.out.println("Condition not satisfied.");
        }
    }
}
