import java.util.HashMap;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the string
        for (char c : inputString.toCharArray()) {
            // Ignore spaces
            if (c != ' ') {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(frequencyMap);
    }
}