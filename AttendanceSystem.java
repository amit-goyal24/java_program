import java.util.HashSet;
import java.util.Set;

public class AttendanceSystem {
    public static void main(String[] args) {
        Set<Integer> attendanceList = new HashSet<>();

        // Add students to the attendance list
        attendanceList.add(101);
        attendanceList.add(102);
        attendanceList.add(103);

        // Attempt to add a duplicate roll number
        boolean added = attendanceList.add(102);
        System.out.println("Duplicate roll number 102 added: " + added);

        // Add another unique roll number
        added = attendanceList.add(104);
        System.out.println("Unique roll number 104 added: " + added);

        // Print the final attendance list
        System.out.println("Final attendance list:");
        for (int rollNumber : attendanceList) {
            System.out.println(rollNumber);
        }
    }
}