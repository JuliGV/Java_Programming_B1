package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String days = "monday tuesday wednesday friday saturday sunday";

//        String [] dayArr = days.split(", ");
//        System.out.println(Arrays.toString(dayArr));

        String [] dayArr2 = days.split("ay ");
        System.out.println(Arrays.toString(dayArr2));

        String [] dayArr3 = days.split("wednesday");
        System.out.println(Arrays.toString(dayArr3));


        String month = "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";

        String [] monthArray = month.split("-");

        for (String each:monthArray) {///month.split("-");
            System.out.println(each.substring(0,1).toUpperCase()+each.substring(1).toLowerCase());

        }


    }
}
