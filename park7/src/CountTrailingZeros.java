public class CountTrailingZeros {
    public static int countZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Zeros = " + countZeros(100));  // 24
    }
}
