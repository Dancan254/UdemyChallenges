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

        ArrayList<String> names = new ArrayList<>(List.of("Ian", "Kamashu","dancan", "Mongs", "Mongs"));


        //using an iterator to travesrse through the list
        Iterator<String> itr = names.iterator();
        //var itr = names.iterator();
        //choice of loop to use depends on the user preference
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        if (itr.next().equals("Mongs")){
            itr.remove();
        }
    }
}
