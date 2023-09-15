package Generics.Model;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printMoreList(lpaStudents);
    }

//    public static <T extends Student> void printList(List<T> students){
//
//        System.out.println("Printing students list and courses");
//        for (var student : students){
//
//            System.out.println(student);
//        }
//        System.out.println();
//    }

    public static void printMoreList(List< ? extends Student> students){

        System.out.println("Printing students list and courses");
        for (var student : students){

            System.out.println(student);
        }
        System.out.println();
    }
}
