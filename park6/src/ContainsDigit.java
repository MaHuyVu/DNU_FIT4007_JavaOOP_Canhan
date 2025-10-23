import java.util.Scanner;

public class ContainsDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean hasDigit = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }

        if (hasDigit)
            System.out.println("The string contains at least one digit.");
        else
            System.out.println("The string does not contain any digits.");
    }
}
