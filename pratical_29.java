import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(88);

        // Display all marks
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Find highest and lowest marks
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        // Display results
        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}
