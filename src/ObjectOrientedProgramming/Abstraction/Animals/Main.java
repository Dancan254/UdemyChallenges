package ObjectOrientedProgramming.Abstraction.Animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Wolf", "small", 50);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Motina", "Big", 100));
        animals.add(new Dog("Boscow", "Big", 150));
        animals.add(new Dog("RANDY", "Big", 120));


        for (Animal animal : animals){
            doAnimalStuff(animal);
        }
    }
    private static void doAnimalStuff(Animal animal){

        animal.move("slow");
        animal.makeNoise();
    }
}
