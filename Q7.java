import java.util.HashMap;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the window size: ");
        int k = scanner.nextInt();

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int distinctCount = 0;

        // Process the first window
        for (int i = 0; i < k; i++) {
            int num = arr[i];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) == 1) {
                distinctCount++;
            }
        }

        System.out.print(distinctCount + " ");

        // Process the remaining windows
        for (int i = k; i < n; i++) {
            int numToRemove = arr[i - k];
            int numToAdd = arr[i];

            // Remove the leftmost element from the window
            freqMap.put(numToRemove, freqMap.get(numToRemove) - 1);
            if (freqMap.get(numToRemove) == 0) {
                distinctCount--;
            }

            // Add the rightmost element to the window
            freqMap.put(numToAdd, freqMap.getOrDefault(numToAdd, 0) + 1);
            if (freqMap.get(numToAdd) == 1) {
                distinctCount++;
            }

            System.out.print(distinctCount + " ");
        }
    }
}