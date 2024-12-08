import java.util.ArrayList;
import java.util.Scanner;

public class InsertElement_SpecificElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        System.out.print("Enter the element to insert: ");
        int elementToInsert = sc.nextInt();

        System.out.print("Enter the index to insert at: ");
        int indexToInsert = sc.nextInt();

        // Insert the element at the specified index
        al.add(indexToInsert, elementToInsert);

        System.out.println("ArrayList after insertion: " + al);
    }
}