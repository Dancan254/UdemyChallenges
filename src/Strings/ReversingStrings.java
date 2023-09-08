package Strings;

import java.util.Scanner;

public class ReversingStrings {
    private static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter String you wish to reverse: ");
        String string = sn.nextLine();
        //reverse(string);
        //reverseChar(string);
       // reverseUsingBuilder(string);
        reverseUsingBuffer(string);
    }

    public static void reverse(String string){
        //hello
        for (int i = string.length() - 1; i >= 0 ; i--) {
            System.out.print(string.charAt(i));
        }
    }
    //using char array
    public static void reverseChar(String string){

        char[] array = string.toCharArray();
        for (int i = string.length() - 1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }

    //using string builder
    public static void reverseUsingBuilder(String string){

        StringBuilder builder = new StringBuilder(string);
        System.out.print(builder.reverse());
    }

    //using string buffer
    public static void reverseUsingBuffer(String string){

        StringBuffer builder = new StringBuffer(string);
        System.out.print(builder.reverse());
    }
}
