import java.util.Scanner;

public class CountMaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
        }

        int count = 0;
        for (int value : a) {
            if (value == max) count++;
        }

        System.out.println("Max = " + max);
        System.out.println("Count of max elements: " + count);
    }
}
