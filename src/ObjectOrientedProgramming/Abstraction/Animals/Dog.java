package ObjectOrientedProgramming.Abstraction.Animals;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow")){
            System.out.println(getExplicitType() + "WALKING!!");
        }else{
            System.out.println(getExplicitType() + "Running!!!");
        }
    }

    @Override
    public void makeNoise() {

        if (type.equalsIgnoreCase("Wolf")){
            System.out.println("WOOOOOF!!!!");
        } else{
            System.out.println("aaaaaauuuu!!!");
        }
    }
}
