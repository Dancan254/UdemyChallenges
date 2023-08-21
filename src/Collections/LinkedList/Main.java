package Collections.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sysdney");
        placesToVisit.add("Jamica");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);
        gettingElements(placesToVisit);

       // printIteArray(placesToVisit);
        //printItinerary(placesToVisit);
        testIterator(placesToVisit);
    }
    
    private static void addMoreElements(LinkedList<String> list){
        list.add("Canada");
        list.add("Uk");
        //queue methods
        list.offer("Cambondia");
        list.offerFirst("China");
        list.offerLast("kuwait");
        //stack methods
        list.push("Peris ann");

    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("kuwait");
        list.removeLast();
        list.removeFirst();
        //queues/ deque
        list.poll();
        list.poll();
        System.out.println(list);

        list.push("Sydney");
        list.push("Congo");
        list.push("Mongolia");
        list.push("Japan");

        String p4 = list.pop();//remove first element
        System.out.println(p4 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list){
        //retrieves elements
        System.out.println("Retrieved element = " + list.get(4));
        System.out.println("Get first " + list.getFirst());
        System.out.println("Get last " + list.getLast());

        System.out.println("Congo is at index " + list.indexOf("Congo"));
        System.out.println("Sydney is at position " + list.lastIndexOf("Sydney"));
        //queue retrieval method
        System.out.println("Element from element " + list.element());
        //stack retrieval methods
        System.out.println("Elements from peek " + list.peek());
        System.out.println("Elements from peek " + list.peekFirst());
        System.out.println("Elements from peek " + list.peekLast());
    }

    public static void printIteArray(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        System.out.println("Trip ends at " + list.getLast());

        //iterating using normal for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println("_ _ ".repeat(10));
        //using enhanced for loop
        for (String places: list){
            System.out.println(places);
        }

        //ignoring the first place of visit
        for (int i = 1; i < list.size(); i++) {
            System.out.println("-->From " + list.get(i - 1) + " to "
            + list.get(i));
        }
        //using enhanced loop, however the traditional loop is efficient
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("-->From " + previousTown + " to " + town);
            previousTown = town;
        }


    }
    public static void printItinerary(LinkedList<String> list) {
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("-->From " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
           // System.out.println(iterator.next());
            if (iterator.next().equals("Congo")){
                iterator.add("Tokyo");
            }
        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        //positioning the cursor of the iterator at some index in the list
        var iterator2 = list.listIterator(3);
        //System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
    }

}
