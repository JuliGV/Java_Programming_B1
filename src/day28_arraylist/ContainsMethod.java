package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Micky");
        names.add("Mouse");

        System.out.println(names.contains("Tom"));

        boolean isList = names.contains("Mouse");
        System.out.println(isList);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(200);
        nums.add(900);
        nums.add(500);
        nums.add(400);
        System.out.println(nums.contains(200));

    }
}
