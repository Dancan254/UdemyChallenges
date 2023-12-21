package NestedClassesAndTypes.Burger;

import java.util.ArrayList;
import java.util.List;

public class Meal{

    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;
    private double conversionRate;

    public Meal(){
        this(1);
    }
    public Meal(double conversionRate){
        this.conversionRate = conversionRate;
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal(){
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString(){
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }
    public void addToppings(String... selectedToppings){

        burger.addToppings(selectedToppings);
    }
private class Item {
    private String name;
    private String type;
    private double price;

    public Item(String name, String type) {
        this(name, type, type.equals("burger") ? Meal.this.price : 0);
    }

    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "%10s%15s$%.2f" . formatted(name, type,
                getPrice(price, conversionRate));
    }

    private static double getPrice(double price, double rate){
        return price * rate;
    }

}

    private class Burger extends Item{
        private enum Extra { BACON, AVOCADO, CHEESE, KETCHUP, MAYO, PICKLES, MUSTARD;
            private double getPrice(){
                return switch(this){
                    case AVOCADO -> 1.0;
                    case BACON, CHEESE -> 1.5;
                    case KETCHUP, MAYO, MUSTARD -> 2;
                    default -> 0;
                };
            }
        }

        private List<Item> toppings = new ArrayList<>();
        Burger (String name){
            super(name, "Burger", 5.0);
        }

        public double getPrice(){
            double total = super.price;
            return super.price;
        }

        private void addToppings(String... selectedToppings){
            for (String selectedTopping : selectedToppings){
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING", topping.getPrice()));
                }catch (IllegalArgumentException e){
                    System.out.println("Topping " + selectedTopping + " does not exist");
                }

            }
        }

        @Override
        public String toString() {

            StringBuilder itemized = new StringBuilder();
            for (Item topping : toppings){
                itemized.append("\n");
                itemized.append(topping);
            }
            return itemized.toString();
        }
    }
}
