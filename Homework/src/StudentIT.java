import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCpp;
    private float scoreJava;

    public StudentIT() {
        super();
    }

    public StudentIT(String masv, String name, int age, float scoreCpp, float scoreJava) {
        super(masv, name, age);
        this.scoreCpp = scoreCpp;
        this.scoreJava = scoreJava;
    }

    public float getScoreCpp() {
        return scoreCpp;
    }

    public void setScoreCpp(float scoreCpp) {
        this.scoreCpp = scoreCpp;
    }

    public float getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(float scoreJava) {
        this.scoreJava = scoreJava;
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
        System.out.print("Nhập điểm C++: ");
        this.scoreCpp = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập điểm Java: ");
        this.scoreJava = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "StudentIT{" +
                "masv='" + getMasv() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", scoreCpp=" + scoreCpp +
                ", scoreJava=" + scoreJava +
                ", average=" + calculateAverage() +
                '}';
    }

    @Override
    public float calculateAverage() {
        return (scoreCpp + scoreJava) / 2;
    }
}
