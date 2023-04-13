package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Laptop");
        list.add("Screen");
        list.add("Keyboard");
        list.add("Mouse");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);


        String removed = list.remove(0);//return the element that was removed
        System.out.println(removed);
        System.out.println(list);

        list.remove("Mouse");//return boolean
        System.out.println(list);
        boolean ret = list.remove("Keyboard");
        System.out.println(ret);
        System.out.println(list);

        list.add("Screen");
        list.add("Screen");
        list.add("Screen");
        list.add("Cable");
        list.add("Screen");
        System.out.println(list);
        list.remove("Screen");
        System.out.println(list);


        //we didn't cover that method yed

        for (String each: list) {
            if (each.equals("Screen")){
                list.remove(each);

            }
            System.out.println(list);

        }

    }
}
