package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(400);
        nums.add(300);
        nums.add(200);
        nums.add(800);
        System.out.println(nums.size());

        System.out.println(nums.isEmpty());

        nums.clear();//not return type
        System.out.println(nums);
        System.out.println(nums.isEmpty());//true
    }
}
