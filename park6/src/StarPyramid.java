import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        String stars = "";
        for (int i = 1; i <= n; i++) {
            stars += "*";
            System.out.println(stars);
        }
    }
}
