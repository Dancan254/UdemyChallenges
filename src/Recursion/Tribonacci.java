package Recursion;

import java.util.HashMap;
import java.util.Map;

public class Tribonacci {

    private static Map<Integer, Integer>  memo = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(tri(5));
        System.out.println(trioNormal(5));
        System.out.println(trioMemo(5));
    }

    //0, 1, 1, 2, 4, 7, 13, 24, 44
    //Using recursion
    public static int tri(int target){

        int first = 0;
        int second = 0;
        int third = 1;

        if (target == 0 || target == 1){
            return 0;
        }
        if (target == 2){
            return 1;
        }
        return tri(target - 1) + tri(target - 2) + tri(target - 3);
    }

    //using memoization
    public static int trioMemo(int position){
        if (position <= 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        if (memo.containsKey(position)){
            memo.get(position);
        }

        int result = trioMemo(position - 1) + trioMemo(position - 2) + trioMemo(position - 3);
        memo.put(position, result);
        return result;
    }

    //without recursion
    public static int trioNormal(int position){
        int first = 0;
        int second = 0;
        int third = 1;
        int temp = 0;
        for (int i = 2; i <= position; i++) {
            temp = first + second + third;
            first = second;
            second = third;
            third = temp;
        }
        return temp;
    }
}
