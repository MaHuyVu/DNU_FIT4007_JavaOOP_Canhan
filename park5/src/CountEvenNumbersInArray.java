import java.util.Scanner;

public class CountEvenNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) count++;
        }

        System.out.println("Number of even elements: " + count);
    }
}
