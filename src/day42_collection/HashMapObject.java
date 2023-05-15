package day42_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        // put(key,value) if we put duplicates, it updates privies one
        map.put(1,"one");
        map.put(2,"one");
        map.put(3,"one");
        map.put(4,"one");
        map.put(5,"one");
        System.out.println(map);

        Map <Integer,String> map2 = new HashMap<>();
        map2.put(1,"one");// is not sorted and not insertion
        map2.put(2,"two");
        map2.put(10,"three");
        map2.put(4,"four");
        System.out.println(map2);


        System.out.println(map2.get(2));
        System.out.println(map2.get(66));// return null because we dont have this key

        String value = map2.get(2);
        System.out.println(value);

        map2.remove(2);
        System.out.println(map2);

        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsValue("two"));
        map2.put(null,"java");
        System.out.println(map2);

        map2.put(null,"python");
        System.out.println(map2);//update every time if we add the same key

    }
}
