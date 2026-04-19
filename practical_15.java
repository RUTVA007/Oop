class Employee {
    String name;
    String department;

    // Constructor
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass Manager
class Manager extends Employee {
    int teamSize;
    String projectName;

    // Constructor
    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class Main {
    public static void main(String[] args) {

        // Base class object
        Employee emp = new Employee("Amit Verma", "HR");

        // Subclass object
        Manager mgr = new Manager("Neha Kapoor", "IT", 10, "AI Development");

        // Runtime polymorphism (parent reference)
        Employee ref;

        ref = emp;
        System.out.println("Employee Details:");
        ref.displayDetails();  // Calls Employee version

        System.out.println();

        ref = mgr;
        System.out.println("Manager Details:");
        ref.displayDetails();  // Calls Manager version (runtime decision)
    }
}
