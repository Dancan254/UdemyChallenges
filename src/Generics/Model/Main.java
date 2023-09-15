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

        testingList(new ArrayList<>(List.of("Ian", "Peris")));
        testingList(new ArrayList<>(List.of(4, 5, 6, 7)));
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

    public static <T> void testingList(List<T> list){

        for (var element : list){
            if (element instanceof String) {
                System.out.println("String:" + ((String) element).toUpperCase());
            } else if (element instanceof Integer) {
                System.out.println("Integer: " + element);
            }
        }
    }
}
