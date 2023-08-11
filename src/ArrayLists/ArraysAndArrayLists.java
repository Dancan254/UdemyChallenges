package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysAndArrayLists {
    public static void main(String[] args) {

        //the list created is not resizable since the list is a copy of the array
        //this method is however mutable
        String[] originalArray = new String[]{"First", "Second", "Third"
        };
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        //sorting
        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray));
        System.out.println("list: " + originalList);

        //to create a fixed size list, this method is immutable
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        //creating an array from an arrayList
        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "March"));
        String[] stringArray = stringLists.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));

    }
}
