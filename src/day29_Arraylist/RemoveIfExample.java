package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8,9,8,77));

        ArrayList<Integer> list1 = new ArrayList<>(list);
        list1.removeIf(each -> each%2 == 0);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.removeIf(each ->each >100);

        ArrayList<String> word = new ArrayList<>(Arrays.asList("Mon","Tue","Wen","Thu","Fri","Sat","Sun"));
        word.removeIf(each -> each.startsWith("M") || each.startsWith("F"));
        System.out.println(word);







    }
}
