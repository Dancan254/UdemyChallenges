package AbstractClasses;

abstract class ShapesStack {

    abstract double calculateArea();
    abstract double calculatePerimeter();

    abstract void displayAttributes();
}

class Circles extends ShapesStack{

    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void displayAttributes(){
        System.out.println("Attributes " + radius);
    }
}

class Rectangles extends ShapesStack{

    private double width;
    private double length;

    public Rectangles(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return width * length;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void displayAttributes(){
        System.out.println("Attributes (" + (int)width + ", " + (int)length + ")");
    }
}
