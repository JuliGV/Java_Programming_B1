package day43_map;

import java.util.HashMap;
import java.util.Map;

public class ClassRoom {
    /*
           Create a Map
           add couple Student objects into that map as a value
           for the key, we can add just numbers starting from 1.
     */
    public static void main(String[] args) {

        /*
                If I want to keep the insertion order -- > LinkedHashMap
                If I want to make sorted order --------- > TreeMap
                If I want to be able to accept null as value  but not as key --- > HashMap, LinkedHashMap
                If I want NOT to be able to accept null neither as key nor as value -- > HashTable
         */

        Map<Integer, Student> map = new HashMap<>();

        // add students
        Student s1 = new Student("Javid",3.45,12);
        map.put(1,s1);
        map.put(2,new Student("Yuliia",4.55,2));
        map.put(3,new Student("Olga",1.23,19));
        map.put(4,new Student("Natalia",5.55,3));
        map.put(5,new Student("Oksana",4.3,1));

        System.out.println(map);

        System.out.println(map.get(3));
        // how can I get only a name of element in the map

        System.out.println(map.get(4).name);
        System.out.println(map.get(4).gpa);
        System.out.println(map.get(4).id);
        System.out.println();

        // looping through map!!!
        System.out.println(map.keySet());

        for (Integer each : map.keySet()) {
            System.out.println("Rank "+ each);
            System.out.println("\tValue "+ map.get(each));
            System.out.println();

        }

        //looping through map Value
        System.out.println("Only value");

        System.out.println(map.values());
        for (Student eachValue : map.values()) {
            if(eachValue.gpa == 5.55){
                System.out.println(eachValue);
            }
        }

        // enterySet();
        for (Map.Entry<Integer, Student> eachEntery : map.entrySet()) {
            System.out.println("Rank "+eachEntery.getKey());
            System.out.println("Value "+eachEntery.getValue());
            System.out.println();

        }

        /*
        .put(key, value);  ---- > this method will add a key and value if the key does not exist in the map. If the key is already in the map, it will just update the value.
    .get(key);          --- > this method will return the value of the matching key, if there is no matching, it will return null
    .containsKey(key);  --- > this method will return boolean if the given key exist among the keys in the map
    .containsValue(value); - > this method will return boolean if the given value exist among the values in the map
    .remove(key);       --- > this method will remove the data (key & value), if the given key is among the keys in the map
    //-----------------------
    .keySet();         ---- > this method will return the set of the key in the map
    .values();         ---- > this method will return the list of values in the map
    .entrySet();       ---- > this method will return a single row map on each iteration
         */




    }
}
