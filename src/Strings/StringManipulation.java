package Strings;

/**those that do not change the underlying meaning:
 * indent, strip, stripLeading, stripLeading, trim, toLowerCase, toUpperCase
 *transform string value:
 * concat, join, repeat, replace, replaceAll, replaceFirst, subString, subSequence
 */
public class StringManipulation {
    public static void main(String[] args) {

        String birthDate = "25/12/2003";
        int startingIndex = birthDate.indexOf("2003");
        System.out.println("Starting index = " + startingIndex);//6
        System.out.println("Birth year = " + birthDate.substring(startingIndex));//2003
        //accessing the month
        System.out.println("Month = " + birthDate.substring(3, 5)); //12

        String newDate = String.join("/", "25", "12", "2003");
        System.out.println("New date = " + newDate);// 25/12/2003

        //replace
        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replaceFirst("/", "?"));
        System.out.println(newDate.replaceAll("/", "__"));

        System.out.println("ABC\n".repeat(5));
        System.out.println("_ _ _".repeat(30));

        System.out.println("ABC\n".repeat(5).indent(8));

        System.out.println("    ABC\n".repeat(5).indent(-2));
        System.out.println("_ _ _".repeat(30));
    }

}
