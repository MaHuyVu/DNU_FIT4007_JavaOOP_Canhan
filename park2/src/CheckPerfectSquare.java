import java.util.Scanner;

public class CheckPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();

        double sqrt = Math.sqrt(n);
        if (sqrt == (int) sqrt) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }
}
