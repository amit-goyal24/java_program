import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(al);

        System.out.println(al);
    }
}