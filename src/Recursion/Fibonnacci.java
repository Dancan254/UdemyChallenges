package Recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonnacci {
//implementing memorization however leads to a lot of time consumption
    private static Map<Integer, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        System.out.println(fibo(5));//5

        System.out.println(recursiveFIbo(8));//21
    }

    public static int fibo(int num){

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= num; i++) {

            c = a + b;
            a = b;
            b = c;

        }

        return c;
    }

    //using recursion
    //return the element at the specified position
    private static int recursiveFIbo(int position){
        if (position == 0){
            return 0;
        }
        if (position <= 2) {
            return 1;
        }

        if (cache.containsKey(position)){
            return cache.get(position);
        }

        int result = recursiveFIbo(position - 1) + recursiveFIbo(position - 2);
        cache.put(position, result);
        return result;
    }
}
