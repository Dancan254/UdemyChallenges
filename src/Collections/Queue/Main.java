package Collections.Queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        //adding elements, they will be sorted in the form LILO
        numbers.add(9);
        numbers.offer(8);
        numbers.add(6);
        numbers.add(5);

        System.out.println(numbers);

        numbers.remove(5);
        System.out.println(numbers);
    }
}
