package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,4,5,4,3,5,6,6,66,76));
        System.out.println(list);

        // sort();
        Collections.sort(list);
        System.out.println(list);

        // revers();
        Collections.reverse(list);
        System.out.println(list);

        // max(); min();

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        //swap();
        Collections.swap(list,0,1);
        System.out.println(list);

        // .frequency();

        ArrayList<Integer> nums = new ArrayList<>(list);
        System.out.println(nums);
        int count = Collections.frequency(nums, 6);
        System.out.println(count);

        ArrayList<String> word = new ArrayList<>(Arrays.asList("one","one","two","one"));
    }
}
