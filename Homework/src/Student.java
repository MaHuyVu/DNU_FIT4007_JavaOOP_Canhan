import java.util.Scanner;

public abstract class Student {
    protected String masv;
    protected String name;
    protected int age;

    public Student() {
        this.masv = "";
        this.name = "";
        this.age = 0;
    }

    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SV: ");
        masv = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
    }

    public abstract String toString();
    public abstract float calculateAverage();
}
