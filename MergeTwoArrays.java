import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Get the size of the first ArrayList
        System.out.print("Enter the size of the first ArrayList: ");
        int size1 = sc.nextInt();

        // Get the elements of the first ArrayList
        System.out.println("Enter the elements of the first ArrayList:");
        for (int i = 0; i < size1; i++) {
            list1.add(sc.nextInt());
        }

        // Get the size of the second ArrayList
        System.out.print("Enter the size of the second ArrayList: ");
        int size2 = sc.nextInt();

        // Get the elements of the second ArrayList
        System.out.println("Enter the elements of the second ArrayList:");
        for (int i = 0; i < size2; i++) {
            list2.add(sc.nextInt());
        }

        // Merge the two ArrayLists
        list1.addAll(list2);

        // Print the merged ArrayList
        System.out.println("Merged list: " + list1);

        //     Method 2: Creating a New List
        // ArrayList<Integer> mergedList = new ArrayList<>();
        // mergedList.addAll(list1);
        // mergedList.addAll(list2);
        // System.out.println("Merged list using new ArrayList: " + mergedList);
    }
}