package SortingTechniques;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 5, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){

        boolean isSwapped;
        int n = arr.length;
        do {
            isSwapped = false;
            //iterate through the array, from index 1
            for (int i = 1; i < n; i++) {

                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    isSwapped = true;
                }
            }
            n--;
        }while (isSwapped);
    }
}
