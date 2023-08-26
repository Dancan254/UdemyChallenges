package Collections.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        //adding elements, they will be sorted in the form LIFO
        numbers.add(9);
        numbers.offer(8);
        numbers.add(6);
        numbers.add(5);
        numbers.add(15);

        System.out.println(numbers);

        numbers.remove(5);
        System.out.println(numbers);
        System.out.println("Number of the front is: " + numbers.peek());
        //iterating through the queue
        var itr = numbers.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        //deletion operation
        numbers.poll();
        numbers.remove();
        numbers.poll();
        System.out.println();
        System.out.println(numbers);

        ArrayList<Integer> nums = new ArrayList<>(List.<Integer>of(4, 6, 7, 8));
        numbers.addAll(nums);
        System.out.println(numbers + " ");


    }
}
