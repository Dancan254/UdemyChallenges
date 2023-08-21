package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MainLL {
    public static void main(String[] args) {

//        CreatingLinkedLists ll = new CreatingLinkedLists();
//        ll.insertingFirst(3);
//        ll.insertingFirst(5);
//        ll.insertingFirst(9);
//        ll.insertingFirst(78);
//        ll.insertingFirst(99);
//
//        ll.insertLast(100);
//        ll.insertAtIndex(100, 3);
//        ll.display();
//        System.out.println(ll.deleteFirst());
//        ll.display();
//        System.out.println(ll.deleteLast());
//        ll.display();
//
        //create a new LinkedList
        int count = 1;
        LinkedList<String> names = new LinkedList<>();
        Scanner sn = new Scanner(System.in);
        do {
            System.out.print("Enter names of your friends: ");
            String name = sn.nextLine();
            names.add(name);
            count++;
        }while (count <= 4);

        //iterate through the names added
//        names.remove(1);
        for (String s : names) {
            System.out.print(s + " ");
        }

    }
}
