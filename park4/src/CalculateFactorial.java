package part4.loops;
import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factorial=1;
        for (int i=1;i<=N;i++){
            factorial*=i;
        }
        System.out.println("N! = "+factorial);
        sc.close();
    }
}
