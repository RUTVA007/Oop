public class Rectangle {
    // Data fields
    double width = 1;
    double height = 1;

    // No-argument constructor
    public Rectangle() {
    }

    // Constructor with parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // default
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());

        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
    }
}

output:
Area of r1: 1.0
Perimeter of r1: 4.0
Area of r2: 15.0
Perimeter of r2: 16.0
