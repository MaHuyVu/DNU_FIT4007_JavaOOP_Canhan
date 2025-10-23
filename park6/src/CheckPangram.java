import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                alphabet[c - 'a'] = true;
        }

        boolean isPangram = true;
        for (boolean b : alphabet) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("The string is a pangram.");
        else
            System.out.println("The string is NOT a pangram.");
    }
}
