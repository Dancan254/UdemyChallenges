package Encapsulation;

import java.util.Locale;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake() {
        return make;
    }

    //setters are used to set rules  for the class
    //they are crucial in encapsulation
    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "lamborghini", "buggati", "bmw" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
