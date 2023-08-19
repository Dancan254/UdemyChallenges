package LinkedList;

public class MainLL {
    public static void main(String[] args) {

        CreatingLinkedLists ll = new CreatingLinkedLists();
        ll.insertingFirst(3);
        ll.insertingFirst(5);
        ll.insertingFirst(9);
        ll.insertingFirst(78);
        ll.insertingFirst(99);

        ll.insertLast(100);
        ll.insertAtIndex(100, 3);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
    }
}
