import java.util.Scanner;

public class Example05BirthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age in 2023: ");
        int age = sc.nextInt();

        int birthYear = 2023 - age;
        System.out.println("Your birth year is: " + birthYear);
    }
}
