package day42_collection;

import java.util.*;

public class SetVSList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);// we can have duplicates
        list.add(5);
        list.add(7);
        list.add(33);
        list.add(-4);
//        list.add(null);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        Set<Integer> set = new HashSet<>();// not inversion order
        set.add(10);
        set.add(20);
        set.add(20);// we can NOT have duplicates
        set.add(5);
        set.add(7);
        set.add(33);
        set.add(-4);
//        set.add(null);
        System.out.println(set);
        //System.out.println(set.get(0)); does NoT work with indexes
        //System.out.println(set.get(set.size()-1)); does NoT work with indexes

        // we can gt element only through foreach loop

        for (Integer each: set ) {
//            if(each == 20){
//                System.out.println(each);
//            }

        }

        //sort the HashSet

        System.out.println(new TreeSet<>(set));

        // convert List to Set remove the duplicates not sorted!!!!

        System.out.println(new LinkedHashSet<>(list));

        /*
        You have a number 1,2,3,4,5,6,1,1
        remove duplicates

         */

        System.out.println(new HashSet<>(Arrays.asList(1,2,3,4,5,6,1,1)));

        //asList method return List type that hava reference of the interface Collection interface
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,1,1));

        List <Integer> listInt = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,1));
        List <Integer> listNoDup  = new ArrayList<>(set2);

        System.out.println(new TreeSet<>(set2));
    }
}
