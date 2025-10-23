import java.util.Scanner;

public class Example03Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
