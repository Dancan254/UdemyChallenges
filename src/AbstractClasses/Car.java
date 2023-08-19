package AbstractClasses;

public class Car extends Vehicle{
    private int numDoors;

    public Car(String model, int numDoors) {
        super(model);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 6;
    }
}
