package Strings;

import java.util.*;

public class RemovingDuplicateChars {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter desired word: ");
        String word = sn.nextLine();

        removeDuplicate(word);

        System.out.println("Using sets");
        removeDuplicates(word);

        System.out.println();
        System.out.println("Using lists: ");
        removeDupUsingList(word);
    }

    //using String builder
    public static void removeDuplicate(String string){
        //hello
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            char character = string.charAt(i);
            if (builder.indexOf(String.valueOf(character)) == -1){
                builder.append(character);
            }
        }
        System.out.println(builder);
    }

    //using TreeSet, this however does not maintain the order of the words
    public static void removeDuplicates(String string){

        Set<Character> unique = new TreeSet<>();
        //convert the string to
        for (char ch : string.toCharArray()){
            unique.add(ch);
        }

        //convert the collection back to String
        StringBuilder str = new StringBuilder();
        for (char ch : unique){
            str.append(ch);
        }

        System.out.print(str);
    }

    //using lists
    public static void removeDupUsingList(String string){

        List<Character> listChar = new ArrayList<>();
        for (char ch : string.toCharArray()){
            if (listChar.contains(ch)){
                continue;
            }
            listChar.add(ch);
        }

        StringBuilder builder = new StringBuilder();
        for (char ch : listChar){
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
