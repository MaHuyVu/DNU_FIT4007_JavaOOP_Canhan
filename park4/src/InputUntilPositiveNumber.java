
import java.util.Scanner;

public class InputUntilPositiveNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N= sc.nextInt();

        do{
            System.out.println("Gia tri khong hop le");
            N= sc.nextInt();
        }while (N<=0);
        System.out.println("Gia tri "+N+" hop le");
        sc.close();
    }
}
