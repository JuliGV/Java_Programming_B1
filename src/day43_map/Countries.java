package day43_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {
        // create a map, that holds data as aString and ArrayList of String as values

        Map<String, ArrayList<String>> countries = new HashMap<>();
        // Add keys
        // United State,  Chicago, New York, Virginia,DC,LA
        // Turkey,        Istanbul,Ankara, Izmir, Antalia
        // Canada
        // value

        countries.put("United States", new ArrayList<>(Arrays.asList("Chigago","New York","Virginia","DC","LA")));
        ArrayList<String> citiesTurkey = new ArrayList<>(Arrays.asList("Istambul","Ankara", "Izmair","Antalia"));
        countries.put("Turkey",citiesTurkey);
        countries.put("Canada",new ArrayList<>(Arrays.asList("Quebec","Totonto","Vancouver")));
        System.out.println(countries);

        for (ArrayList<String> eachValue : countries.values()) {
            for (String eachCity : eachValue){
                if(eachCity.startsWith("V") || eachCity.startsWith("I")){
                    System.out.println(eachCity);
                }
            }

        }
    }
}
