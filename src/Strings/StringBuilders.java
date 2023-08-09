package Strings;

/**
 * String builders, used due to mutability:
 * ways to create:
 *pass at string, pass no args, pass an integer, pass some other types of characters
 * methods:
 * append, delete, deleteCharAt, insert, reverse, setLength
 */
public class StringBuilders {
    public static void main(String[] args) {

        String helloWorld = "Hello" + "World";
       // helloWorld.concat(" and good bye");

        StringBuilder hello = new StringBuilder("Hello" + "World");
        hello.append(" and Good Bye");
        printInformation(helloWorld);
        printInformation(hello);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart2 = new StringBuilder(32);

        printInformation(emptyStart);
        emptyStart.append("Hi".repeat(13));

        printInformation(emptyStart2);
        emptyStart2.append("a".repeat(17));


        //applying the methods

        StringBuilder builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and GoodBye");

        //delete and insert
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        //reverse
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }
    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());

    }
    public static void printInformation(StringBuilder builder){
        System.out.println("String builder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());

    }

}
