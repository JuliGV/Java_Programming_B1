package day43_map;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {

        Map<String ,String > map = new HashMap<>();
        map.put("James","java");
        map.put("Tom","Cartoon");
        map.put("Bond","Movie");
        map.put("Nadir","Automation");
        map.put(null,"test");
        System.out.println(map);

        Map<String ,String> linked = new LinkedHashMap<>();
        linked.put("James","java");
        linked.put("Tom","Cartoon");
        linked.put("Bond","Movie");
        linked.put("Nadir","Automation");
        linked.put(null,"test");
        System.out.println(linked);

        Map<String,String> tree = new TreeMap<>();



    }
}
