import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraylistToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        // Convert ArrayList to array using toArray() method
        Integer[] array = al.toArray(new Integer[al.size()]);

        System.out.println(Arrays.toString(array));
    }
