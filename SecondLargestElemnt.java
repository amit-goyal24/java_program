import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargestElemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        // Sort the ArrayList in descending order
        Collections.sort(al, Collections.reverseOrder());

        // The second largest element will be at index 1
        int secondLargest = al.get(1);

        System.out.println("Second largest element: " + secondLargest);
    }
}