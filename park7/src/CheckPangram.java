public class CheckPangram {
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!s.contains(String.valueOf(c))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(text));  // true
    }
}
