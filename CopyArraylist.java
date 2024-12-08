import java.util.ArrayList;
import java.util.Scanner;

public class CopyArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al1.add(sc.nextInt());
        }

        // Create a copy using the constructor
        ArrayList<Integer> al2 = new ArrayList<>(al1);

        System.out.println("Copied ArrayList: " + al2);
    }
}   