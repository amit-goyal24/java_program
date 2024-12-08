import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        // Remove elements divisible by 3 using Iterator
        Iterator<Integer> ir = al.iterator();
        while (ir.hasNext()) {
            int num = ir.next();
            if (num % 3 == 0) {
                ir.remove();
            }
        }

        System.out.println(al);
    }
}