package day44_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExapmle {
    public static void main(String[] args) {
        /*
        Map accepts
        First_name Gosling
        Last_name James
        Batch 1

         */

        Map<String,String> people = new HashMap<>();
        people.put("FIRST_NAME","James");
        people.put("LAST_NAME","Gosling");
        people.put("BATCH","1");

        Map<String,Object> people2 = new HashMap<>();
        people.put("FIRST_NAME","Yuliia");
        people.put("LAST_NAME","Kolisnyk");
        people.put("BATCH","1");

        Map<String,Object> people3 = new HashMap<>();
        people.put("FIRST_NAME","Oksana");
        people.put("LAST_NAME","Mova");
        people.put("BATCH","1");



        Map<String,String> stringStringMap = makeMap("Yuliia","Kolisnyk","1");
        Map<String,String> stringStringMap1 = makeMap("James","Gosting","5");
        Map<String,String> stringStringMap2 = makeMap("Oksana","Mova","1");

        List<Map <String,String> > list = new ArrayList<>();
        list.add(stringStringMap);
        list.add(stringStringMap1);
        list.add(stringStringMap2);

        list.add(makeMap("Natalia","Lubchenko","1"));
        System.out.println(list.get(0).get("FIRST_NAME"));
        System.out.println(list.get(0).get("LAST_NAME"));

        //gp through ArrayList of Map - print information for each person

        for (Map<String, String> each : list) {
            System.out.println(each);

        }

        // looping through all names
        for (Map<String, String> each : list) {
            System.out.println(each.get("FIRST_NAME"));

        }

        // looping through all people info who's batch =< 4
        for (Map<String, String> each : list) {
            if (Integer.parseInt(each.get("BATCH")) <= 4 ){
                System.out.println(each);

            }


        }



        // create a method that accepts an array of String and returns a Map
    }

    public static Map<String,String> makeMap (String ... arr){
        Map<String,String> map = new HashMap<>();
        map.put("FIRST_NAME",arr[0]);
        map.put("LAST_NAME",arr[1]);
        map.put("BATCH",arr[2]);

        return map;

    }


}
