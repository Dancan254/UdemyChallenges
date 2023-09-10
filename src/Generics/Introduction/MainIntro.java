package Generics.Introduction;

import java.util.Scanner;

public class MainIntro {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        CustomList<Integer> integerList = new CustomList<>();
        System.out.println("Integers");

        integerList.addElement(34);
        integerList.addElement(58);
        integerList.addElement(89);
        integerList.removeElement(89);
        integerList.removeElement(15);
        System.out.println(integerList.toString());

        System.out.println("Enter index you wish to see its value: ");
        int index = sn.nextInt();
        try {
            System.out.println(integerList.getIndex(index));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index not present");
            System.out.println(e.getMessage());
        }

        System.out.println("Strings");

        sn.nextLine();//read new line
        //for strings
        CustomList<String> stringList = new CustomList<>();
        stringList.addElement("Peris");
        stringList.addElement("Ian");
        stringList.addElement("Duncan");
        stringList.removeElement("Ian");
        System.out.println(stringList.toString());
    }
}
