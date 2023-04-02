package day_21_array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        double [] arr = new double[5];// Index 01234
         // not correct because Index until 4

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));/// 0.0,0.0,....


        int []arr2 = new int [3];
        System.out.println(Arrays.toString(arr2));//0,0,0


        boolean [] arr3 = new boolean[2];
        System.out.println(Arrays.toString(arr3));// false, false

        String [] arr4 = new String [4];
        System.out.println(Arrays.toString(arr4));///null,null,null,null

        System.out.println("------------------------");

        arr [0] =10;
        System.out.println(arr[0]);

        arr [1] = 23.3;

        System.out.println(Arrays.toString(arr));

        arr [2] = -44.4;
        arr [3] = 100;
        arr [4] = 200;

        String [] cities = {"Fairfax","New york","Alexandria","Bethesda","Reston","Westfild"};
        System.out.println(Arrays.toString(cities));
        cities [5] = "Montclair";
        System.out.println(Arrays.toString(cities));

        System.out.println(cities[2]);///print only 1, "Alexandria


        arr = new double[8];// we create new object with a size of 8 element
        System.out.println(Arrays.toString(arr));//print new 0.0,0.0......so on to 8 0.0








    }
}
