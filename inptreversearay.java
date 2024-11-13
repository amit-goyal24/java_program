import java.util.Scanner;
public class inptreversearay {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] originalArray = new int[size];

        // Take input for the array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // Reverse the array
        int[] reversedArray = reverseArray(originalArray);

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }

    // Method to reverse the array
    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversed = new int[n];

        // Reverse the array
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];
        }

        return reversed;
    }
}


    
