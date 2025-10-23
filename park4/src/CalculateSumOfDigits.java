
import java.util.Scanner;
public class CalculateSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so tu nhien N: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Tong cac chu so cua " + n + " la: " + sum);
    }
}
