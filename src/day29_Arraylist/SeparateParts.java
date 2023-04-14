package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        String str = "HGB766754JBBN&*&^%";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        System.out.println(numbers);


        ArrayList<String> specials = new ArrayList<>(list);
        specials.retainAll(Arrays.asList("!","@","#","$","%","^","&","*","(",")","-","+"));
        System.out.println(specials);

        ArrayList<String> letter = new ArrayList<>(list);
        letter.removeAll(numbers);
        System.out.println(letter);
        letter.removeAll(specials);
        System.out.println(letter);

    }
}
