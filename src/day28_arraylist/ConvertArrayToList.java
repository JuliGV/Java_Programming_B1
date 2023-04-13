package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        ArrayList<Integer> nums;
        Integer [] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        Arrays.asList(arr);//this method from Arrays class takes an Array and make as Array list
        nums =new ArrayList<>(Arrays.asList(1,2,3,5,4,6,5,4,5));
        System.out.println(nums);

        // here we created Array list and assign array directly
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,4,5,6,7));
        System.out.println(list2);


    }
}
