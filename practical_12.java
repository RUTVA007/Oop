class VolumeCalculator {

    // Volume of Cube: side^3
    void calculateVolume(double side) {
        double volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    // Volume of Rectangular Cube: length * width * height
    void calculateVolume(double length, double width, double height) {
        double volume = length * width * height;
        System.out.println("Volume of Rectangular Cube: " + volume);
    }

    // Volume of Sphere: (4/3) * π * r^3
    void calculateVolume(double radius, boolean isSphere) {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();

        // Calling overloaded methods
        vc.calculateVolume(5);                 // Cube
        vc.calculateVolume(4, 5, 6);           // Rectangular Cube
        vc.calculateVolume(3, true);           // Sphere
    }
}
