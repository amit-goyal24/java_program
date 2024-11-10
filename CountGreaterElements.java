import java.util.Scanner;

public class CountGreaterElements {
    public static void main(String[] args) {
        int[] array = {79, 70, 67, 30, 23, 20, 5, 3, 3, 2};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element X: ");
        int x = scanner.nextInt();

        int count = 0;
        for (int element : array) {
            if (element > x) {
                count++;
            }
        }

        System.out.println("Number of elements strictly greater than " + x + " is " + count);
    }
}