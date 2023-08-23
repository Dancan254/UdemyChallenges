package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * used to traverse through a given set of data
 * available functions/ methods->> boolean hasNext- checks if any elements remain to be processed
 * ->>next - returns the next element in the collection and advances the iterator to the next position
 * void remove() - removes the last element returned by the next method
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(List.of("Ian", "Kamashu","dancan", "Mongs", "Peris", "Muhtoni", "Kits"));


        //using an iterator to travesrse through the list
        Iterator<String> itr = names.iterator();
        //var itr = names.iterator();
        //choice of loop to use depends on the user preference
        while (itr.hasNext()){
            //System.out.print(itr.next() + " ");
            if (itr.next().equals("Mongs")){
                itr.remove();
            }
        }
        System.out.print(names + " ");

        //adding elements
        var iterator = names.listIterator();
        while (iterator.hasNext()){
            //if condition to show where the element is to be added
            if (iterator.next().equals("Ian")){
                iterator.add("dancan");
            }
        }
        System.out.println();
        System.out.print(names + " ");

        //iterating backwards through the list
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous() + " ");
        }

        //accessing elements
        var iterate = names.listIterator(4);
        System.out.println(iterate.previous());
    }
}
