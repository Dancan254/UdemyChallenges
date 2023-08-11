package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String [] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yoghurt");
        System.out.println(list);

        ArrayList<String> nextList = new ArrayList<>(List.of("Cherries", "pickels"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        //accessing elements
        System.out.println("third element: " + groceries.get(2));

        //searching
        boolean findingMilk = groceries.contains("milk");
        System.out.println("Milk found " + findingMilk);
        if(groceries.contains("milk")){
            System.out.println("Found milk");
        }
        //add milk
        groceries.add("milk");
        System.out.println("_ _ _".repeat(10));
        System.out.println(groceries);
        System.out.println("firstIndex of milk: " + groceries.indexOf("milk"));
        System.out.println("Last index of milk: " + groceries.lastIndexOf("milk"));

        //removing elements
        groceries.remove("bananas");
        System.out.println("_ _ _".repeat(10));
        System.out.println(groceries);

        groceries.remove(1);
        System.out.println(groceries);

        //removing a set of elements
        groceries.removeAll(List.of("pickels", "cherries"));

        //retainAll
        groceries.retainAll(List.of("eggs"));

        //clear
        groceries.clear();
        System.out.println(groceries);
        //check if empty
        boolean checkIfEmpty = groceries.isEmpty();
        System.out.println("Is empty: " + checkIfEmpty);

        //addAll
        System.out.println("_ _ _".repeat(10));
        groceries.addAll(List.of("Apples", "Mangoes", "Berries", "Pawpaw", "Peach"));
        System.out.println(groceries);

        groceries.addAll(Arrays.asList("Eggs", "Pickles", "Ham", "Butter"));
        System.out.println(groceries);

        //sorting the elements
        groceries.sort(Comparator.naturalOrder());
        System.out.println("_ _ _".repeat(10));
        System.out.println(groceries);

        //reverse order
        groceries.sort(Comparator.reverseOrder());
        System.out.println("_ _ _".repeat(10));
        System.out.println(groceries);

        //getting a list from an array
        var groceryArray = groceries.toArray(new String [groceries.size()]);
        System.out.println("_ _ _".repeat(10));
        System.out.println(Arrays.toString(groceryArray));


    }
}
