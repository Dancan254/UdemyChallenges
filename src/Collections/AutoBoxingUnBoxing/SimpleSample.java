package Collections.AutoBoxingUnBoxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleSample {
    public static void main(String[] args) {

//        autoboxing
        ArrayList<Integer> arr = new ArrayList<>(List.of(9, 10, 22, 33));

        int sum = sumCalculator(arr);
        //print the numbers first
        System.out.print("the numbers are: " + arr + " ");
        System.out.println("\nthe sum of the numbers is: " + sum);
    }

    //crate a method to calculate sum of numbers, should return sum

    public static int sumCalculator(ArrayList<Integer> numbers){

        int sum = 0;
        //iterate through the list
       for (Integer num : numbers){
           //outboxing
           sum += num;
       }
       return sum;
    }
}
