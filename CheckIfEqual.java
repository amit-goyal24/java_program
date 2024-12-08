import java.util.ArrayList;
import java.util.Scanner;

public class CheckIfEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        System.out.print("Enter the size of the first ArrayList: ");
        int size1 = sc.nextInt();

        System.out.println("Enter the elements of the first ArrayList:");
        for (int i = 0; i < size1; i++) {
            al1.add(sc.nextInt());
        }

        System.out.print("Enter the size of the second ArrayList: ");
        int size2 = sc.nextInt();

        System.out.println("Enter the elements of the second ArrayList:");
        for (int i = 0; i < size2; i++) {
            al2.add(sc.nextInt());
        }

        boolean isEqual = al1.equals(al2);

        System.out.println("Are they equal? " + isEqual);
}
}