package Recursion;

import java.util.HashMap;
import java.util.Map;

public class SumPossible {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 9, 12};
        int sum = 2;
        boolean test = isSumPossible(arr, sum);
        System.out.println("it is: " + test);
    }

    public static boolean isSumPossible(int[] numbers, int target){

        return isSumPossible(numbers, target, new HashMap<>());
    }
    public static boolean isSumPossible(int[] numbers, int sumTarget, Map<Integer, Boolean> memo){
        //base cases
        if (sumTarget == 0) return true;
        if (sumTarget < 0) return false;

        //check if present in the memo
        if (memo.containsKey(sumTarget)){
            memo.get(sumTarget);
        }

        //iterate through the arr
        for (int num : numbers){
            int remainder = sumTarget - num;
            if (isSumPossible(numbers, remainder)){
                memo.put(sumTarget, true);
                return true;
            }
        }
        memo.put(sumTarget, false);
        return false;
    }
}
