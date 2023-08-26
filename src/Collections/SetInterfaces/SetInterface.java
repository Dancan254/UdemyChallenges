package Collections.SetInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Extends collection
 * restrict the insertion of duplicate elements by making use of a hashtable
 *cannot be instantiated directly, collection frameWorks are therefore needed
 * values entered are by no means supposed to be singular objects
 * take key consideration in the load capacity and load factor to reduce time complexity and save memory space
 */
public class SetInterface {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(List.of(4, 5, 7, 9));
        //ArrayList<Integer> al2 = new ArrayList<>(List.of(4, 5, 7, 9)); //when the values are similar the size will be one

        ArrayList<Integer> al2 = new ArrayList<>(List.of(1, 2, 3, 6));
        HashSet<ArrayList> hs = new HashSet<>();
        hs.add(al);
        hs.add(al2);

        System.out.println(hs);
        System.out.println("Accessing properties and elements");
        System.out.println("Size = " + hs.size());
        //hashcode
        HashSet<Integer> hs1 = new HashSet<>(List.of(99, 100, 45, 78, 101));

        System.out.println("HashCode first: " + hs.hashCode());
        System.out.println("Hashcode second: " + hs1.hashCode());

        //removing elements


        System.out.println("removed: " + hs1.remove(99) + " and " + hs.remove(al));

        //iterating through

        Iterator<Integer> itr = hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }

        //iterating through the collections
        Iterator<ArrayList> itrr = hs.iterator();
        while(itrr.hasNext()){
            System.out.println("Iterating through the arraylists: \n" + itrr.next() + " ");
        }

        if (hs1.contains(99)){
            System.out.println("Found 99");
        }
        else{
            System.out.println("Missing");
        }

    }
}
