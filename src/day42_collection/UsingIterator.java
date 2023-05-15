package day42_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("James");
        list.add("Gosling");
        list.add("Java");
        System.out.println(list);

        Iterator<String> it = list.iterator();


        System.out.println(it.next());// works like get method, take first element
        System.out.println(it.next());// works like get method, take first element
        System.out.println(it.next());// works like get method, take first element
        //System.out.println(it.next());// NoSuchElementException

        try{
            System.out.println(it.next());
        }catch (NoSuchElementException e ){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
