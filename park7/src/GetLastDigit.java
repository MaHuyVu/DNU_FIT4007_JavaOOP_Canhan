public class GetLastDigit {
    public static int getLastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {
        System.out.println(getLastDigit(-123));  // 3
    }
}
