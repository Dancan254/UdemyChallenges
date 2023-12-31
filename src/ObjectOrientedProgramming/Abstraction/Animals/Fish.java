package ObjectOrientedProgramming.Abstraction.Animals;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow")){
            System.out.println(getExplicitType() + "Feeding!!");
        }else{
            System.out.println(getExplicitType() + "Swimming!!!");
        }
    }
    @Override
    public void makeNoise() {

        if (type.equalsIgnoreCase("goldfish")){
            System.out.println("CHIIIII!!!!");
        } else{
            System.out.println("shhhahhh!!!");
        }
    }
}
