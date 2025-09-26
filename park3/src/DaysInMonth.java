

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int year = sc.nextInt();

        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();

        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
        }
    }
}
