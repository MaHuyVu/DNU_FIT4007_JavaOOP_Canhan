import java.util.Scanner;

public class Example04Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        double s = perimeter / 2; // Semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
