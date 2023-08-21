package ObjectOrientedProgramming.Inheritance;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 500);
        doAnimaStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimaStuff(dog, "fast");

        Dog doggy = new Dog("Doggy", 15);
        doAnimaStuff(doggy, "Fast");
        Dog boscow = new Dog("Boscow", 56, "floppy", "curved");
        doAnimaStuff(boscow, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimaStuff(wolf, "slow");

        Fish goldie = new Fish("GoldFish", 0.45, 2, 3);
        doAnimaStuff(goldie, "fast");
    }
    public static void doAnimaStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ _ ");
    }
}
