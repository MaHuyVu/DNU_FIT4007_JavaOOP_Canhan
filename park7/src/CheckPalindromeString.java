public class CheckPalindromeString {
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));  // true
    }
}
