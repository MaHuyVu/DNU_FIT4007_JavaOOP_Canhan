import java.util.Scanner;

public class CompareStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a: ");
        String a = sc.nextLine();
        System.out.print("Enter string b: ");
        String b = sc.nextLine();

        if (a.length() >= b.length()) {
            System.out.println("Longer string: " + a);
        } else {
            System.out.println("Longer string: " + b);
        }
    }
}
