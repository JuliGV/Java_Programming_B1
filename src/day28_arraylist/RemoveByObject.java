package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);// this will remove the indexes --- index are always primitive DT
        System.out.println(nums);
//        nums.remove(500);// 500 is an index

        Integer element = 500;
        nums.remove(element);
        System.out.println(nums);// remove 500

        nums.remove((Integer)800);
        System.out.println(nums);

        nums.add(900);

        nums.remove(Integer.valueOf(900));/// not use
        System.out.println(nums);


    }
}
