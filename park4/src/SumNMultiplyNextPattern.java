
import java.util.Scanner;

public class SumNMultiplyNextPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum=0;

        if (N <= 0) {
            System.out.println("Vui long nhap so nguyen duong!");
        } else {
            for (int i = 1; i <= N; i++) {
                sum+=i*(i+1);
            }
        }
        System.out.println("Tong bieu thuc la:"+sum);
    }
}
