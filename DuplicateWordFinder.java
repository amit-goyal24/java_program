import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
    public static void main(String[] args) {
        String paragraph = "This is a paragraph with some duplicate words. This word is repeated twice.";

        // Convert the paragraph to lowercase for case-insensitive comparison
        String lowercaseParagraph = paragraph.toLowerCase();

        // Split the paragraph into words
        String[] words = lowercaseParagraph.split("\\s+");

        // Create a HashSet to store unique words
        Set<String> uniqueWords = new HashSet<>();

        // Iterate through each word
        for (String word : words) {
            // If the word is already in the set, it's a duplicate
            if (!uniqueWords.add(word)) {
                System.out.println("Duplicate word: " + word);
            }
        }
    }
}