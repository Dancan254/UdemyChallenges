package ObjectOrientedProgramming.Abstraction.Vehicles;

public class MotorCycle extends Vehicle {
    private boolean hasSideCar;

    public MotorCycle(String model, boolean hasSideCar) {
        super(model);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 50.0
                ;
    }
}
