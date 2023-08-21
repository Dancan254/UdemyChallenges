package ObjectOrientedProgramming.Inheritance;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(14);
        System.out.println("Area of circle is: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Radius = " + cylinder.getRadius());
        System.out.println("Height = " + cylinder.getHeight());
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("Volume of the cylinder is : " + cylinder.getVolume());
    }
}
