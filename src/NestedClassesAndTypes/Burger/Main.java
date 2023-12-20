package NestedClassesAndTypes.Burger;

public class Main {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        System.out.println(regularMeal);

        System.out.println("Including conversion rate");
        Meal usMeal = new Meal(0.68);
        System.out.println(usMeal);
    }
}
