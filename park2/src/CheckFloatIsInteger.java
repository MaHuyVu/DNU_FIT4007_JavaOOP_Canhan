import java.util.Scanner;

public class CheckFloatIsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float a = sc.nextFloat();

        if (a == (int)a) {
            System.out.println(a + " is an integer.");
        } else {
            System.out.println(a + " is not an integer.");
        }
    }
}
