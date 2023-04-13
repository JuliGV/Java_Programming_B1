package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Bey");
        list.add("Universe");
        list.add("Universe");
        list.add("Universe");
        list.add("Universe");
        System.out.println(list);

        System.out.println(list.indexOf("World"));

        System.out.println(list.indexOf("Universe"));//return index of element of the first match
        System.out.println(list.lastIndexOf("Universe"));//return index of element at the first match from the end


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(37);
        nums.add(76);
        nums.add(94);
        nums.add(24);

        System.out.println(nums.indexOf(37));
        nums.set(nums.indexOf(76),87);
        System.out.println(nums);

        int index = nums.indexOf(567);//if element doesnt exist it return -1
        System.out.println(index);

    }
}
