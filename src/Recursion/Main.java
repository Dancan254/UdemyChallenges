package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = sn.nextInt();
        int sum = Summation(number);
        System.out.println("The summation of " + number + " is " + sum);

        System.out.println("Enter number: ");
        int num = sn.nextInt();
        System.out.println("Factorial is: " + factorial(num));

    }

    //method for summation
    public static int Summation(int n){

        if (n <= 0){
            return 0;
        }

        else {
            return n + Summation(n - 1);
        }
    }

    //factorial
    public static int factorial(int n){
        if (n <= 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}
