package Generics.GenericClassesIntro;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {

    List<T> myList = new ArrayList<>();
    //add element

    public void addElement(T element){
        if (!myList.contains(element)) {
            System.out.println("Adding " + element + " to the list");
            myList.add(element);
        }
    }
    //remove
    public void removeElement(T element){
        if (myList.contains(element)) {
            System.out.println("Removing " + element + " from the list");
            myList.remove(element);
        }
        else{
            System.out.println(element + " not found");
        }
    }
    //method to get index
    public T getIndex(int index){
        return myList.get(index);
    }
    //print out elements
    @Override
    public String toString() {
        return "CustomList{" +
                "myList=" + myList +
                '}';
    }
}
