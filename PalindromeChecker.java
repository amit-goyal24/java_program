import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string or number to check for palindrome: ");
        String input = scanner.nextLine();

        // Check if the input is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Method to check if the input is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for uniformity
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Use two pointers to check for palindrome
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It is a palindrome
    }
}