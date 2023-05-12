package day41_collection;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();// unordered, random order
        set1.add("hello");
        set1.add("$5.0");
        set1.add("400");
        set1.add("hello");// duplication, not allows a duplicate
        set1.add("%");
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>();// unordered, random order
        set2.add("hello");
        set2.add("$5.0");
        set2.add("400");
        set2.add("hello");// duplication, not allows a duplicate
        set2.add("%");
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();//

        set3.add("hello");
        //set3.add(null); does not allows a Null NullPointException
        set3.add("$5.0");
        set3.add("400");
        set3.add("hello");// duplication, not allows a duplicate
        set3.add("%");
        System.out.println(set3);

        Set<Integer> set4 = new TreeSet<>();//we can sort ArrayList to convert ArrayList to TreeSet
        set4.add(5);
        set4.add(1);
        set4.add(2);
        set4.add(-56);
        set4.add(-4);

    }
}
