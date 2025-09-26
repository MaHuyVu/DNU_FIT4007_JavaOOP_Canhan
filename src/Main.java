public class Main {
    public static void main(String[] args) {
        System.out.println("=== Nhập sinh viên IT ===");
        StudentIT it = new StudentIT();
        it.input();
        System.out.println(it.toString());

        System.out.println("\n=== Nhập sinh viên BA ===");
        StudentBA ba = new StudentBA(); // sửa Ba -> ba
        ba.input();
        System.out.println(ba.toString());
    }
}
