import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " time(s)");
        }
    }
}
