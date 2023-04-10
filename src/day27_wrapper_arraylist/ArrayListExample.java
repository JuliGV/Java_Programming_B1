package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();// by default size is 10
        System.out.println(number);
        number.add(10);// add element to the end
        number.add(89);

        System.out.println(number);
        System.out.println(number.size());// size of ArrayList


        System.out.println(number.get(0));/// we get element putting index on parante

        number.add(1,-77);
        System.out.println(number);



    }
}
