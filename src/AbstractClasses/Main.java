package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();
        son.partner();

        MotorCycle motor = new MotorCycle("Suzuki", true);
        motor.showInfo();

        Car car = new Car("V8", 5);
        car.showInfo();

        Shape circle = new Circle(15);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

    }
}
