package Collections.SetInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSets {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lsh = new LinkedHashSet<>();
        //adding methods
        lsh.add(56);
        lsh.add(70);
        lsh.add(5);
        lsh.add(6);
        lsh.add(566);
        lsh.add(55);
        lsh.add(544);
        lsh.add(556);

        //adding from a collection
        ArrayList<Integer> al = new ArrayList<>(List.of(9,99, 606, 676));
        lsh.addAll(al);
        //check presence
        System.out.println("Does it contain 70 ->> " + lsh.contains(70));

        //accessing individual elements
        //using for each
        System.out.println("using for each");
        lsh.forEach(element -> System.out.print(element + " "));

        //using enhanced for loop
        System.out.println("\nusing enhanced for loop");
        for (Integer nums : lsh){
            System.out.print(nums + " ");
        }

        //removing elements
        System.out.println("\nRemoving elements");
        //removing the list first
        System.out.println("Removing the list: ");
       al.forEach(lsh::remove);
        //lsh.removeAll(al);
        System.out.println(lsh);
        System.out.println("removing 566");
        lsh.remove(566);
        System.out.println(lsh);

        //converting to array
        Integer[] arr = lsh.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        //iterate through the array
        for (Integer elements: arr){
            System.out.print(elements + " ");
        }


    }
}
