package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(19);
        nums.add(1383);
        nums.add(73);
        nums.add(399);

        System.out.println(nums);

        nums.set(1,45);
        System.out.println(nums);

        nums.set(0,65);
        System.out.println(nums);
    }
}
