package Recursion;

public class Fibonnacci {
    public static void main(String[] args) {

        System.out.println(fibo(5));
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
}
