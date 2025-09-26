import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePm;
    private float scoreBA;

    public StudentBA() {
        super();
    }

    public StudentBA(String masv, String name, int age, float scorePm, float scoreBA) {
        super(masv, name, age);
        this.scorePm = scorePm;
        this.scoreBA = scoreBA;
    }

    public float getScorePm() {
        return scorePm;
    }

    public void setScorePm(float scorePm) {
        this.scorePm = scorePm;
    }

    public float getScoreBA() {
        return scoreBA;
    }

    public void setScoreBA(float scoreBA) {
        this.scoreBA = scoreBA;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã SV: ");
        setMasv(sc.nextLine());
        System.out.print("Nhập tên SV: ");
        setName(sc.nextLine());
        System.out.print("Nhập tuổi: ");
        setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập điểm Quản lí dự án: ");
        this.scorePm = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập điểm Quản trị kinh doanh: ");
        this.scoreBA = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "StudentBA{" +
                "masv='" + getMasv() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", scorePm=" + scorePm +
                ", scoreBA=" + scoreBA +
                ", average=" + calculateAverage() +
                '}';
    }

    @Override
    public float calculateAverage() {
        return (scorePm + scoreBA) / 2;
    }
}
