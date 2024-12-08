import java.util.HashMap;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Convert the sentence to lowercase to ignore case sensitivity
        sentence = sentence.toLowerCase();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordFrequencyMap);
    }
}