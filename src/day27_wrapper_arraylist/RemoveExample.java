package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Water");
        list.add("Banana");
        System.out.println(list);
        System.out.println("I have total: "+list.size());

        list.remove(0);// returns the element if the boolean result is true.And it is true if the element is removed
        System.out.println( list.remove(0));// returnt element that was removed

        System.out.println(list);
        String removeE = list.remove(list.size()-1);//remove last one
        System.out.println(removeE);
        System.out.println(list);

        boolean removed = list.remove("Water");
        System.out.println(removed);

        boolean rem = list.remove("Watter");
        System.out.println(rem);
    }
}
