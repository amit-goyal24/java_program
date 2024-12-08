import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // Check if the lengths are different, in which case they can't be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("False");
            return;
        }

        // Create a HashMap to store character frequencies for str1
        HashMap<Character, Integer> charCountMap1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }

        // Create a HashMap to store character frequencies for str2
        HashMap<Character, Integer> charCountMap2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }

        // Compare the two HashMaps to check if they are equal
        if (charCountMap1.equals(charCountMap2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}