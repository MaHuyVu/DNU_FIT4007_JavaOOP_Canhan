public class CheckPerfectSquare {
    public static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(49));  // true
    }
}
