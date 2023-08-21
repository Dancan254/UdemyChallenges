package Collections.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge {

    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<String> towns = new LinkedList<>();
        addElements(towns);

    }
    //method to add elements to the list
    private static void addElements(LinkedList<String> towns) {
        //var iterator = towns.listIterator();
        String addTown = null;
        if (towns.isEmpty()) {
            System.out.println("Enter town to add");
            addTown = sn.nextLine();
            towns.add(addTown);
            System.out.println("added " + addTown);
        }

        if (towns.contains(addTown)) {

        }
    }

    //creating the interactive option menu
    private static void showMenu(){
        System.out.println("""
                Available actions (select word or letter);
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit\040""");
    }
}
