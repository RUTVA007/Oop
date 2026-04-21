interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    // Implementation of Exam interface
    @Override
    public boolean isPassed(int mark) {
        return mark >= 35; // passing marks condition
    }

    // Implementation of Classify interface
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 35) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Result result = new Result();

        int mark = 72;
        double average = 65.5;

        // Using Exam interface method
        if (result.isPassed(mark)) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has failed.");
        }

        // Using Classify interface method
        String division = result.getDivision(average);
        System.out.println("Division: " + division);
    }
}
