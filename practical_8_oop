class Point {
    int x, y;

    // Default constructor
    public Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Point p1 = new Point();
        p1.display();

        // Using parameterized constructor
        Point p2 = new Point(10, 20);
        p2.display();

        // Using copy constructor
        Point p3 = new Point(p2);
        p3.display();
    }
}

\\

output:
Point coordinates: (5, 5)
Point coordinates: (10, 20)
Point coordinates: (10, 20)


