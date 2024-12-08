import java.util.ArrayList;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        // System.out.print("Enter the number of elements: ");
        // int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < 5; i++) {
            al.add(sc.nextInt());
        }

        int largest = al.get(0); // Initialize largest with the first element

        for (int i = 1; i < al.size(); i++) {
            if (al.get(i) > largest) {
                largest = al.get(i);
            }
        }

        System.out.println("Maximum element: " + largest);
    }
}