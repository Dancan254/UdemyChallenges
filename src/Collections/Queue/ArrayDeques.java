package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Double Ended Queue
 * can delete and insert at both ends
 * creating an instance is not possible
 * it is an interface hence implementation is applied
 * gives a mechanism to use a resizable array
 * cannot contain null obj
 * not thread safe
 * BigO(1)
 * faster than linked list and stack
 */
public class ArrayDeques {
    public static void main(String[] args) {

       ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(23);
        dq.add(46);
        dq.add(67);
        dq.add(90);
        dq.add(234);

        System.out.print(dq + " ");
//other adding methods
        dq.addFirst(67);
        dq.addLast(45);

        LinkedList<Integer> ll = new LinkedList<>(List.of(7,8, 9));
        //add form the collection
        dq.addAll(ll);

        System.out.print("After adding more: \n" + dq + "\n");


        //accessing
        System.out.println("First element: " + dq.peek());
        System.out.println("First prior element: " + dq.peekFirst());
        System.out.println("Last peek: " + dq.peekLast());
        System.out.println("Lat element: " + dq.getLast() );

        //removing elements
        System.out.println("removing elements");
        System.out.println("First pop: " + dq.pop());
        System.out.println("First poll: " + dq.pollFirst());
        System.out.println("last poll " + dq.pollLast());
        System.out.println("Remove " + dq.remove());

        System.out.println("New list: " + dq);

        //iterating through the list
        Iterator<Integer> itr = dq.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
