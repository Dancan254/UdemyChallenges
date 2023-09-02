package ObjectOrientedProgramming.Abstraction.Vehicles;

public abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    //abstract method to calculate fuel efficiency
    public abstract double calculateFuelEfficiency();

    //common method for displaying vehicle information
    public void showInfo(){
        System.out.println("Model " + getModel());
        System.out.println("Fuel efficiency " + calculateFuelEfficiency() + " mpg");
    }
}
