
import java.util.Scanner;

public class GenderSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số từ 0 đến 2: ");
        int n = sc.nextInt();

        switch (n) {
            case 0:
                System.out.println("Nam");
                break;
            case 1:
                System.out.println("Nữ");
                break;
            case 2:
                System.out.println("Khác");
                break;
            default:
                System.out.println("Không hợp lệ");
        }
    }
}
