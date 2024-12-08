import java.util.ArrayList;
import java.util.Scanner;

public class FindIndexOfSpecificElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        System.out.print("Enter the element to find: ");
        int elementToFind = sc.nextInt();

        int index = al.indexOf(elementToFind);

        if (index != -1) {
            System.out.println("Index of " + elementToFind + ": " + index);
        } else {
            System.out.println(-1);
        }
    }
}