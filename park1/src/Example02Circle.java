import java.util.Scanner;

public class Example02Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
}
