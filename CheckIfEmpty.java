import java.util.ArrayList;
import java.util.Scanner;

public class CheckIfEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        boolean isEmpty = al.isEmpty();

        System.out.println("Is the ArrayList empty? " + isEmpty);
    }
}