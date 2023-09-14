package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Comparing {
    public static void main(String[] args) {

        Integer num = 6;
        Integer[] others = {5, 7, 8, 6, 9};

        for (Integer number : others){
            int val = num.compareTo(number);
            System.out.printf("%d %s %d: compare to = %d%n", num,
                    (val == 0 ? "==" : (val < 0) ? "< " : ">"), number, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String i : fruit){
            int val = banana.compareTo(i);
            System.out.printf("%s %s %s: compareTo = %d%n", banana,
                    (val == 0? "==" : (val < 0 ? "<" : ">")), i, val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));
    }
}
