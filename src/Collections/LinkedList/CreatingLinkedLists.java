package Collections.LinkedList;

public class CreatingLinkedLists {
    private Node head;
    private Node tail;
    private int size;

    public CreatingLinkedLists(){
        this.size = 0;
    }

    //inserting at a particular index
    public void insertAtIndex(int value, int index){
        if (index == 0){
            insertingFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    //inserting
    public void insertLast(int value){
        if (tail == null){
            insertingFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertingFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    //deleting first
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    //deleting last
    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    //how to display
    //print the head value, create a temp node= head
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int value;
        private Node next;

        //takes the simple value, by default when no object is provided
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
}
