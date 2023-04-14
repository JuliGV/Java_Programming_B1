package day29_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("energy drink");
        drinks.add("hot chocolate");


        ArrayList<String> drinks2 = drinks;

        ArrayList<String> drinks3 = new ArrayList<>(drinks);

        String [] drinkList = {"Juice","Milk","Cappuccino","Iced coffee"};

        ArrayList<String> drink4 = new ArrayList<>(Arrays.asList(drinkList));
        System.out.println(drink4);
        ArrayList<String> drink5 = new ArrayList<>(Arrays.asList("Juice","Milk","Cappuccino","Iced coffee"));
        System.out.println(drink5);

        ArrayList<String> dring6 = new ArrayList<>();
        dring6.addAll(Arrays.asList("Juice","Milk","Cappuccino","Iced coffee"));

        dring6.addAll(0,Arrays.asList("drink","drink"));
        System.out.println(dring6);
        dring6.addAll(Arrays.asList("drink1","drink2"));
        System.out.println(dring6);




    }
}
