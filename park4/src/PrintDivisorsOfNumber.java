
import java.util.Scanner;

public class PrintDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong!");
        } else {
            System.out.println("Cac uoc so tu nhien cua " + N + " la:");

            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
