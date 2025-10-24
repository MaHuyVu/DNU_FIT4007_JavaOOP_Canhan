public class PrintStringNTimes {
    public static void printString(String s, int n) {
        for (int i = 0; i < n; i++) System.out.println(s);
    }

    public static void main(String[] args) {
        printString("Hello", 3);
    }
}
