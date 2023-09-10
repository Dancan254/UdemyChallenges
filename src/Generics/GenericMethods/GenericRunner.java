package Generics.GenericMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericRunner {

    static  <X> X doSomething(X value){
        return value;
    }

    //for void methods
    static <X> void duplicates(List<X> list){
        Set<X> uniqueElements = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueElements);
    }

    public static void main(String[] args) {

        System.out.println(doSomething("Ian"));//no need to specify the data type
        System.out.println(doSomething(9));

        ArrayList<String> list = doSomething(new ArrayList<>(List.of("Ann", "Muthoni", "Ann")));
        duplicates(list);
        System.out.println(list);
    }

}
