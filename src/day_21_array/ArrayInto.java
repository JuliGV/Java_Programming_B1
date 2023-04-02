package day_21_array;

import java.util.Arrays;

public class ArrayInto {
    public static void main(String[] args) {
        // with normal way

        String city1 = "Fairfax";
        String city2 = "New york";
        String city3 = "Alexandria";
        String city4 = "Bethesda";
        String city5 = "Reston";
        String city6 = "Westfild";

        // 2 ways to declare the Array

        String [] cities = {"Fairfax","New york","Alexandria","Bethesda","Reston","Westfild"};// good
        String cities2 []  = {"Fairfax","New york","Alexandria","Bethesda","Reston","Westfild"};//good

      // is wrong []  String cities2   = {"Fairfax","New york","Alexandria","Bethesda","Reston","Westfild"};


        String [] cities3 = {city1,city2,city3,city4,city5,city6};// good, but first more common
        // 6 elements

        //How I can reach each of elements?

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        // How I can print all elements in Array?

        System.out.println("all cities"+cities[0]+cities[1]+cities[2]+" and so on ");

//        //Arrays.toString(parameter);
//
        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(cities).substring(1));

        String allCities = Arrays.toString(cities);
        System.out.println(allCities);


        System.out.println(Arrays.toString(cities).substring(1, Arrays.toString(cities).length()-1));





        System.out.println("----------------------------");


        // How do we get the number of elements in array
        System.out.println(cities.length);
        System.out.println(Arrays.toString(cities).length());


    }
}
