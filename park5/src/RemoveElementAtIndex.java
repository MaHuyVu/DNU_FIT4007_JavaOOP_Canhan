import java.util.Scanner;

public class RemoveElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter index k to remove (0 <= k < N): ");
        int k = sc.nextInt();

        System.out.println("Array after removing element at index " + k + ":");
        for (int i = 0; i < n; i++) {
            if (i != k) System.out.print(a[i] + " ");
        }
    }
}
