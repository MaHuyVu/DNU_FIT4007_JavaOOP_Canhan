import java.util.Scanner;

public class CheckTriangleSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("These sides form a triangle.");
        } else {
            System.out.println("Not a triangle.");
        }
    }
}
