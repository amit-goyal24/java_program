import java.util.HashSet;
import java.util.Set;

public class UniqueBadgeIDs {
    public static void main(String[] args) {
        Set<Integer> badgeIDs = new HashSet<>();

        // Add valid badge IDs
        badgeIDs.add(101);
        badgeIDs.add(202);
        badgeIDs.add(303);

        // Attempt to add duplicate IDs
        boolean added = badgeIDs.add(202); // Duplicate, won't be added
        System.out.println("Duplicate ID 202 added: " + added);

        added = badgeIDs.add(404); // Unique, will be added
        System.out.println("Unique ID 404 added: " + added);

        // Print the final unique list of badge IDs
        System.out.println("Unique badge IDs:");
        for (int id : badgeIDs) {
            System.out.println(id);
        }
    }
}