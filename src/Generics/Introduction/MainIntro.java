package Generics.Introduction;

public class MainIntro {
    public static void main(String[] args) {

        CustomList<Integer> integerList = new CustomList<>();
        System.out.println("Integers");

        integerList.addElement(34);
        integerList.addElement(58);
        integerList.addElement(89);
        integerList.removeElement(89);
        integerList.removeElement(15);
        System.out.println(integerList.toString());

        System.out.println("Strings");

        //for strings
        CustomList<String> stringList = new CustomList<>();
        stringList.addElement("Peris");
        stringList.addElement("Ian");
        stringList.addElement("Duncan");
        stringList.removeElement("Ian");
        System.out.println(stringList.toString());
    }
}
