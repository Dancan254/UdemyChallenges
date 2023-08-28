package AbstractClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackOverFlowProblemMain {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        List<ShapesStack>  shapes = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int numOfShapes = sn.nextInt();

        for (int i = 0; i < numOfShapes; i++) {

            System.out.println("\nEnter 1 for circle, 2 for rectangle: ");
            int choice  = sn.nextInt();

            if (choice == 1){
                System.out.println("Enter radius of the circle: ");
                double radius = sn.nextDouble();
                Circles circle = new Circles(radius);
                System.out.println("The area is: " + circle.calculateArea());
                System.out.println("The perimeter is: " + circle.calculatePerimeter());
                shapes.add(new Circles(radius));
            } else if (choice == 2) {
                System.out.println("Enter width: ");
                double width = sn.nextDouble();
                System.out.println("Enter length: ");
                double length = sn.nextDouble();

                Rectangles rectangles = new Rectangles(width, length);
                System.out.println("The area is: " + rectangles.calculateArea());
                System.out.println("The perimeter is: " + rectangles.calculatePerimeter());
                shapes.add(new Rectangles(width, length));
            }else {
                System.out.println("Invalid choice, try again");
            }


        }

        System.out.println("Enter the Threshold: ");
        double threshold = sn.nextDouble();

        for (ShapesStack shape : shapes){
            double area = shape.calculateArea();
            double perimeter = shape.calculatePerimeter();

            if (area > threshold){
                shape.displayAttributes();
                System.out.println("The shape with area " + area + " and perimeter " + perimeter + ": " + shape.getClass().getSimpleName());
            }
        }
    }
}
