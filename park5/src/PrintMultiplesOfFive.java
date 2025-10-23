import java.util.Scanner;

public class PrintMultiplesOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Numbers divisible by 5:");
        for (int value : a) {
            if (value % 5 == 0) {
                System.out.print(value + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No element is divisible by 5.");
        }
    }
}
