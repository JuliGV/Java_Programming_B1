package day43_map;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {
        // create a map that accepts String as Key and Double as value

        Map<String,Double> map = new HashMap<>();

        map.put("Water",2.33);
        map.put("Coffee",5.66);
        map.put("Apples",2.66);
        map.put("Bread",2.00);
        map.put("Cucumber",1.00);

        // can you print
        System.out.println("Store Inventory");
        for (Map.Entry<String, Double> eachRow : map.entrySet()) {
            System.out.println("\t "+eachRow.getKey()+" for $"+eachRow.getValue());

        }

        System.out.println(map.values());

    }
    }

