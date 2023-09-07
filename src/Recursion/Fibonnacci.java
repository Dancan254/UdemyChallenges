package Recursion;

public class Fibonnacci {
    public static void main(String[] args) {

        System.out.println(fibo(5));

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
        } else if (position == 1 || position == 2) {
            return 1;
        }
        else {
            return recursiveFIbo(position - 1) + recursiveFIbo(position - 2);
        }
    }
}
