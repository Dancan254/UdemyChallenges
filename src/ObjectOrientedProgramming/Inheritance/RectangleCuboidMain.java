package ObjectOrientedProgramming.Inheritance;

public class RectangleCuboidMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(55, 40);
        System.out.println("width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(20, 30, 40);
        System.out.println("_ _".repeat(10) + "Cuboid" + "_ _".repeat(10));
        System.out.println("Width: " + cuboid.getWidth());
        System.out.println("length: " + cuboid.getLength());
        System.out.println("Height: " + cuboid.getHeight());
        System.out.println("Volume: " + cuboid.getVolume());

        System.exit(0);
    }
}
