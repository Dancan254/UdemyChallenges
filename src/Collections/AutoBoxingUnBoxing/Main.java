package Collections.AutoBoxingUnBoxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Integer autoBoxed = 15;
       int autoUnBoxing = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getDoubleObject();
        double resultUnboxed = getLiteralDoublePrimitive();;

        Integer [] IntegerArray= new Integer[5];
        IntegerArray[0] = 12;
        System.out.println(Arrays.toString(IntegerArray));

        Character[] chars = {'A', 'B', 'C'};
        System.out.println(Arrays.toString(chars));

        var ourList = getList(2, 3, 4, 5);
        System.out.println(ourList);

    }
    private static int returnInt(Integer i){
        return i;
    }

    private static Integer returnInteger(int i){
        return i;
    }
    //method that take an argument
    private static ArrayList<Integer> getList(int...varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs){
            aList.add(i);
        }
        return aList;
    }
    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
