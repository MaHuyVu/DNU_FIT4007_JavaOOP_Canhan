import java.util.Scanner;

public class CountACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') count++;
        }

        System.out.println("The number of 'a' characters: " + count);
    }
}
