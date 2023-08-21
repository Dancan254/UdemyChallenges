package Collections.Vectors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Vector<String> friends = new Vector<>(40);
        friends.add("Kamashu");
        friends.add("peris");
        friends.add("Brian");
        friends.add("Joe");

        ArrayList<String> otherFriends = new ArrayList<>(List.of("ann", "Muthoni", "Ngigi"));
        friends.addAll(otherFriends);

        System.out.print(friends + " ");
        System.out.println();
        //iterating through the vectors

        Iterator<String> itr = friends.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        System.exit(0);
    }
}
