import java.util.Scanner;

public class Example09DivisionOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b (≠ 0): ");
        int b = sc.nextInt();

        System.out.println(a + " / " + b + " = " + ((float)a / b));
    }
}
