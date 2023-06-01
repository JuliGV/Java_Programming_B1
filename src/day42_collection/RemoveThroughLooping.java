package day42_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveThroughLooping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,3,4,5,6,7,8,9,7,6,45,34,56));

        // we can NOT use this because indexes elements get shifted, so it could skip some elements
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) < 5 ){
//                list.remove(i);
//            }
//
//        }
//
//        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        // hasNext(); - return boolean value
        while (it.hasNext()){
            if(it.next() < 5){
                it.remove();

            }
        }
        System.out.println(list);// it helps as through iteration but we still using list
    }
}
