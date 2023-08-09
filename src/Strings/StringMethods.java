package Strings;

/**
 * String Inspection:
 * length, charAt, indexOf, lastIndexOf, isEmpty, isBlank
 * Comparison methods:
 * contains, endsWith, startsWith, regionMatches
 */
public class StringMethods {
    public static void main(String[] args) {

        printInfo("Hello Ian");
        printInfo("");//the string is empty
        printInfo("\t \n");//string is blank

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('d'));//10
        System.out.printf("Index of world = %d %n", helloWorld.indexOf("World"));//6

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',3));//accessing the other l, 3
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));// 3

        //comparison methods

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("Value matches exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value matches ignoring case");
        }

        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if (helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if (helloWorld.contains("World")){
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World")){
            System.out.println("Value matches exactly");
        }

    }

    public static void printInfo(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
       // System.out.println(string.substring(5));

    }
}
