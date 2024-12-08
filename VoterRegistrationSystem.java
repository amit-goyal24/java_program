import java.util.HashSet;
import java.util.Set;

public class VoterRegistrationSystem {
    public static void main(String[] args) {
        Set<Integer> voterIDs = new HashSet<>();

        // Register valid voter IDs
        voterIDs.add(1001);
        voterIDs.add(1002);
        voterIDs.add(1003);

        // Attempt to register a duplicate ID
        boolean added = voterIDs.add(1002);
        System.out.println("Duplicate voter ID 1002 added: " + added);

        // Register another unique ID
        added = voterIDs.add(1004);
        System.out.println("Unique voter ID 1004 added: " + added);

        // Print the final list of registered voter IDs
        System.out.println("Registered voter IDs:");
        for (int voterID : voterIDs) {
            System.out.println(voterID);
        }
    }
}