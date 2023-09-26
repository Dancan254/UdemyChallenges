package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    //do not allow duplicate key, allows duplicate values
    //do not allow duplicate null, allows duplicate null values
    //does not maintain insertion order
    //best suited for accessing elements
    public static void main(String[] args) {

        //initialization
        //Integer represents the key, String-> value
        Map<Integer, String> maps = new HashMap<>();
        //adding elements
        maps.put(100, "Maths");//this whole set is known as an entry
        maps.put(101, "English");
        maps.put(102, "Kiswahili");
        maps.put(103, "Science");

        //accessing elements
        String maths =  maps.get(100);//retrieve the value associated with the key
        System.out.println(maths);//prints out the value -> maths

        //check if element exists
        if (maps.containsKey(100)){
            System.out.println("Exists");
        }

        //iterating through the keys and values
        //the values are retrieved from the keys
        for (Integer key : maps.keySet()){
            //assign the values to the respective data type
            //retrieve them from the given keys
            String value = maps.get(key);
            System.out.println(value);
        }

        //size of map
        System.out.println(maps.size());

        //removing an element using key
        maps.remove(103);//removes science

        //check if map is empty
        //returns a boolean t or f
        boolean checkEmpty = maps.isEmpty();
        System.out.println("Is empty = " + checkEmpty);

        //print out the elements of maps
        System.out.println(maps);

        //create another map to store the values of previous one
        Map<Integer, String> maps2 = new HashMap<>();
        //add all elements of maps
        maps2.putIfAbsent(104, "Social Studies");
        maps2.put(105, "Cre");
        maps2.putAll(maps);
        System.out.println(maps2);

        //implementing EntrySet for iteration, actually the best way to iterate
        for (Map.Entry<Integer, String> entry : maps2.entrySet()){
            //accessing the key
            Integer key = entry.getKey();
            //accessing the corresponding value
            String value = entry.getValue();

            System.out.println("Key -> " + key + " -> value -> " + value);
        }

    }
}
