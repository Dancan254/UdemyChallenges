package Collections.Vectors.Stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        //Adding elements use push, add
        names.add("Ian");
        names.push("Peris");
        names.push("kaamshu");
        names.add("brian");
        //pop removes the last item to be inserted, it implements the LIFO system
        names.pop();
        System.out.print(names + " ");

        System.out.println(names + " ");
        //searching for an element
        System.out.println(names.search("Ian"));//returns the index of the obj
        //return the top most element, element added last
        System.out.println("Top " + names.peek());

        //remove all the elements
        names.clear();
        System.out.println("Elements cleared ");
    }
}
