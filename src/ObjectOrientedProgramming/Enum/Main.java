package ObjectOrientedProgramming.Enum;

public class Main {

    public static void main(String[] args) {

        double weight = 80;
        for (Planet planets : Planet.values()){
            System.out.printf("Your weight on %s is %.2f Newtons%n", planets, planets.surfaceWeight(weight));
        }
    }
}
