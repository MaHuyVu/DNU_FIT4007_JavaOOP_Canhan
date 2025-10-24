public class GetFirstDigit {
    public static int getFirstDigit(int n) {
        n = Math.abs(n);
        while (n >= 10) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(getFirstDigit(1234));  // 1
    }
}
