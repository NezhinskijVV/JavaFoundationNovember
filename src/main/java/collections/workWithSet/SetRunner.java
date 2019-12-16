package collections.workWithSet;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        System.out.println("Add first String");
        stringSet.add("Volida");

        for (String element: stringSet){
            System.out.println(element);
        }

        stringSet.add("Volida");
        System.out.println("After adding second same String");
        for (String element: stringSet){
            System.out.println(element);
        }
        System.out.println(stringSet.add("Volida"));


    }
}