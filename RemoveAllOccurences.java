import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveAllOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        System.out.print("Enter the element to remove: ");
        int elementToRemove = sc.nextInt();

        // Remove all occurrences of the element
        al.removeAll(Collections.singletonList(elementToRemove));

        System.out.println(al);
    }
}