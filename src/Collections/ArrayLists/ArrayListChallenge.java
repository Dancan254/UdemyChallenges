package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

    private static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        boolean flag = true;
        while(flag){
            showMenu();
            //int choice = sn.nextInt();
            switch (Integer.parseInt(sn.nextLine())){
                case 1 -> addItems(items);
                case 2 -> removeItems(items);
                default -> flag = false;
            }
            items.sort(Comparator.naturalOrder());
            System.out.println(items);

        }
        sn.close();
    }

    private static void addItems(ArrayList<String> items) {
        System.out.println("Add items [separated by comma]:");
        //user input items
        String[] itemsToAdd = sn.nextLine().split(",");
        //add items to the arrayList
       // items.addAll(List.of(itemsToAdd));
        for(String i: itemsToAdd){
            String trimmed = i.trim();
            if (!items.contains(trimmed)){
                items.add(trimmed);
            }
            else{
                System.out.println(trimmed + " already exists");
            }
        }

    }

    //method to remove items
    private static void removeItems(ArrayList<String> items) {
        System.out.println("Enter items to be removed [separated by comma]:");
        //user input items
        String[] itemsToRemove = sn.nextLine().split(",");
        //add items to the arrayList
        for(String i: itemsToRemove){
            String trimmed= i.trim();
            if (items.contains(trimmed)){
            items.remove(trimmed);
            }
            else {
                System.out.println(trimmed + " is not in the list");
            }
        }

    }

    //method to show menu options
    private static void showMenu(){
        System.out.println("""
                Show Available options:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which you want to do:\040""");
    }

}
