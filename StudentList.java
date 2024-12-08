import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Add 5 students to the list
        students.add(new Student(1, "Alice", 95.5));
        students.add(new Student(2, "Bob", 82.3));
        students.add(new Student(3, "Charlie", 78.1));
        students.add(new Student(4, "David", 92.7));
        students.add(new Student(5, "Eve", 68.9));

        double averageMarks = calculateAverageMarks(students);
        System.out.println("Average Marks: " + averageMarks);

        Student topScorer = findTopScorer(students);
        System.out.println("Top Scorer: Name - \"" + topScorer.name + "\", Marks - " + topScorer.marks);
    }

    public static double calculateAverageMarks(ArrayList<Student> students) {
        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        return totalMarks / students.size();
    }

    public static Student findTopScorer(ArrayList<Student> students) {
        Student topScorer = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getMarks() > topScorer.getMarks()) {
                topScorer = students.get(i);
            }
        }
        return topScorer;
    }
}