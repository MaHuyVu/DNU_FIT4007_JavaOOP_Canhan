import java.util.Scanner;

public class CheckSquareRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double a = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double b = sc.nextDouble();

        if (a == b)
            System.out.println("Đây là hình vuông.");
        else
            System.out.println("Đây không phải là hình vuông.");
    }
}
