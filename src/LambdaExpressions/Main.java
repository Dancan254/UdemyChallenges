package LambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Ian", "Ann", "Duncan"));

        for (String s : list){
            System.out.println(s);
        }

        list.sort((a, b) -> a.compareTo(b));
        System.out.println("_ _ ".repeat(10));
        //list.forEach(s -> System.out.println(s));
        list.forEach((System.out::println));

        System.out.println("_ _ ".repeat(10));
        String prefix = "nato";
         list.forEach((var myString) -> {
             char first = myString.charAt(0);
             System.out.println(prefix + " " + myString + " Means " + first);
         });

    }
}
