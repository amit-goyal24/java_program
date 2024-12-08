import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        System.out.print("Enter the element to replace: ");
        int oldElement = sc.nextInt();

        System.out.print("Enter the new element: ");
        int newElement = sc.nextInt();

        // Replace all occurrences of oldElement with newElement
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == oldElement) {
                al.set(i, newElement);
            }
        }
        
        System.out.println(al);
    }
}