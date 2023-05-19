package day43_map;

import java.util.HashMap;
import java.util.Map; /*

        method that accept theString and return a Map and count as a key and store as a value
         */

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        System.out.println(frequencyOfChar("apple"));

    }

        public static Map <String,Integer> frequencyOfChar (String str){

            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                String key = str.charAt(i)+"";
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+1);
                }else {
                    map.put(key,1);
                }


            }
            return map;

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
