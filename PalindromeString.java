import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Generate the palindrome of the input string
        String palindrome = generatePalindrome(input);

        // Print the palindrome
        System.out.println("Palindrome of the string: " + palindrome);
    }

    // Method to generate palindrome
    public static String generatePalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        // Append the reverse of the string to itself
        return str + sb.reverse().toString();
    }
}
