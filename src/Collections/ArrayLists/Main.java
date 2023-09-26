package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.List;

//create a record for grocery items
record GroceryItem(String name, String type, int count){
   GroceryItem (String name){
       this(name, "DAIRY", 1);
   }

   @Override
    public String toString(){
       return String.format("%d %s in %s", count, name.toUpperCase(), type);
   }
}
public class Main {
    public static void main(String[] args) {
        List<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Yoghurt"));
        groceryItems.add(new GroceryItem("Butter"));
        groceryItems.add(new GroceryItem("Oranges", "PRODUCE", 5));
        //add mangoes to the third index
        groceryItems.add(2,new GroceryItem("Mangoes", "PRODUCE", 5));
        //set apples to the first index
        groceryItems.set(0, new GroceryItem("Apples", "PRODUCE", 4));
        System.out.println(groceryItems);

        //REMOVING ELEMENTS
        groceryItems.remove(2);
        System.out.println(groceryItems);

        //iterating through the list
        for (GroceryItem item: groceryItems){
            System.out.println(item);
        }
        //setting capacity
        ArrayList<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 7; i++) {
            numbers.add((i + 1) * 5);
            System.out.println(numbers + " ");
        }
        System.out.println();
    }
}
