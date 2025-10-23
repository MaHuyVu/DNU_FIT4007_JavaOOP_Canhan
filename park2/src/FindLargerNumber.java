import java.util.Scanner;

public class FindLargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Larger number is: " + a);
        } else {
            System.out.println("Larger number is: " + b);
        }
    }
}
