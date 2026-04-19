import java.util.Scanner;

class Employee {
    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating object
        Employee emp = new Employee();

        // Calling methods
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}


output:
Enter employee name: John
Enter employee salary: 50000
Employee Name: John
Employee Salary: 50000.0





