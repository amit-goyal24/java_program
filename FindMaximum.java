import java.util.ArrayList;
import java.util.Collections;

public class FindMaximum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(12);
        list.add(7);
        list.add(3);

        int maxElement = Collections.max(list);
        System.out.println("Maximum element: " + maxElement);
    }
}
