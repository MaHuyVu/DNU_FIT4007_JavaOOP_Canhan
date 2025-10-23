import java.util.Scanner;

public class NextMinuteTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (0–23): ");
        int h = sc.nextInt();
        System.out.print("Enter minute (0–59): ");
        int m = sc.nextInt();

        m++;
        if (m == 60) {
            m = 0;
            h++;
            if (h == 24) h = 0;
        }

        System.out.println("Time after one minute: " + h + ":" + String.format("%02d", m));
    }
}
