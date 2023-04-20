package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicate {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        list.removeIf(each -> Collections.frequency(list,each)>1);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,4,5,4,4,4,6,66,7,7));
        System.out.println(removeDuplicates(nums));
    }
}
