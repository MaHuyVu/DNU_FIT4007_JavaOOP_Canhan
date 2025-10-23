import java.util.Scanner;

public class SumEvenAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            if (i % 2 == 1 && a[i] % 2 == 0) {
                sum += a[i];
            }
        }

        System.out.println("Sum of even elements at odd indices: " + sum);
    }
}
