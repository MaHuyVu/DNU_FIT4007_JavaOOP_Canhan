import java.util.Scanner;

public class Example08NameLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name length is: " + name.length());
    }
}
