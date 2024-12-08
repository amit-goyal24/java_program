import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        // Remove duplicates using HashSet
        Set<Integer> hs = new HashSet<>(al);
        al.clear();
        al.addAll(hs);

        System.out.println(al);

        //    Method 2: Iterating and Removing Duplicates
        // for (int i = 0; i < al.size(); i++) {
        //     for (int j = i + 1; j < al.size(); j++) {
        //         if (al.get(i) == al.get(j)) {
        //             al.remove(j);
        //             j--; // Adjust the index after removal
        //         }
        //     }
        // }

        // System.out.println("Unique numbers using iteration: " + numbers);
    }
}