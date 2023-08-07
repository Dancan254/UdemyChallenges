package Udemy;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "Medium": "Large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    //constructor chaining
    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public void makeNoise(){
        if (type == "Wolf"){
            System.out.println("ow Woooo!");
        }
        bark();
        System.out.println();
    }
    public Dog() {
        super("chihuahua", "small", 50);
    }

    private void bark(){
        System.out.print("Woof! ");
    }

    private void run(){
        System.out.println("Running>>>> ");
    }

    private void walk(){
        System.out.println("Walking.. ");
    }

    private void wagTail(){
        System.out.println("Tail wagging.. ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow"){
           walk();
           wagTail();
        }else{
            run();
            bark();
        }
       // System.out.println();
    }
}
