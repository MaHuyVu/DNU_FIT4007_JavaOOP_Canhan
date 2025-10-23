
import java.util.Scanner;

public class CheckIfPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong!");
        } else {
            int temp = N;
            while (temp % 2 == 0) {
                temp /= 2;
            }

            if (temp == 1) {
                System.out.println(N + " la luy thua cua 2");
            } else {
                System.out.println(N + " khong phai la luy thua cua 2");
            }
        }
        sc.close();
    }
}
