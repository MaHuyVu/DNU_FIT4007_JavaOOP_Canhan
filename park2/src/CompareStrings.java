import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a: ");
        String a = sc.nextLine();
        System.out.print("Enter string b: ");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are different.");
        }
    }
}
