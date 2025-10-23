import java.util.Scanner;

public class CheckValidScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a score: ");
        float score = sc.nextFloat();

        if (score >= 0 && score <= 10) {
            System.out.println("Valid score.");
        } else {
            System.out.println("Invalid score.");
        }
    }
}
