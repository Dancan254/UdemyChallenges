package Collections.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class challenge1 {
    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place morocco = new Place("Morocco", 1374);
        addPlace(placesToVisit, morocco);
        System.out.println(placesToVisit);
        addPlace(placesToVisit, new Place("morocco", 1374));
        addPlace(placesToVisit, new Place("China", 1234));
        addPlace(placesToVisit, new Place("Beijing", 124));
        addPlace(placesToVisit, new Place("Hong Kong", 1934));
        addPlace(placesToVisit, new Place("Taiwan", 1879));
        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner sn = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        showMenu();
        while(!quitLoop){
            //print out the position of the first place
            if(!iterator.hasPrevious()){
                System.out.println("Originating: " + iterator.next());
            }
            if(!iterator.hasNext()){
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter value: ");
            String menuItem = sn.nextLine().toUpperCase().substring(0,1);

            switch(menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){       //reversing direction
                        forward = true;
                        if (iterator.hasNext()){
                            iterator.next(); // adjust position
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if(forward){       //reversing direction
                        forward = false;
                        if (iterator.hasPrevious()){
                            iterator.previous(); // adjust position
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    showMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void showMenu(){
        System.out.println("""
                Available actions (select word or letter);
                (F)orward
                (B)ackwards
                (L)ist places
                (M)enu
                (Q)uit""");
    }
    private static void addPlace(LinkedList<Place> list, Place place){
        //check for existence of the place
        if (list.contains(place)){
            System.out.println(place + " already int the list");
            return;
        }
        //ignoring the case
        for(Place p: list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println(place + " already exists in your list");
                return;
            }
        }

        //distance
        int matchedIndex = 0;
        for(var listPlace: list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

}
