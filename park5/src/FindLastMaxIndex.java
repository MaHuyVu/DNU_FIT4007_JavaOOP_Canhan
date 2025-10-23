import java.util.Scanner;

public class FindLastMaxIndex {
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
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] >= max) {
                max = a[i];
                index = i;
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Last index of max: " + index);
    }
}
