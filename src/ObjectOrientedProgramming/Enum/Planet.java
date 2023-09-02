package ObjectOrientedProgramming.Enum;

public enum Planet {

    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.972e+24, 6.371e6),
    MARS(6.419e+23, 3.3895e6);
    // Add more planets with mass and radius

    private final double mass; // in kilograms
    private final double radius; // in meters

    // Constructor
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Custom method to calculate surface gravity
    double surfaceGravity() {
        return 6.67430e-11 * mass / (radius * radius);
    }

    // Custom method to calculate weight on the planet
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }

}



