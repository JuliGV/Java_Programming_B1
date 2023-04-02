package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultiarrayExample {
    public static void main(String[] args) {
        int [] n = {1,2,3};
        int [] m = {10,23,36,39};
        int [][] all = {{1,2,3},{10,23,36,39}};
        int [][] allq= {n,m};

        System.out.println(Arrays.deepToString(all));// print dementional array
        System.out.println(Arrays.toString(n));// works for 1 Array

        System.out.println("First array: "+Arrays.toString(all[0]));// print first Array - index 0
        System.out.println("Second array: "+Arrays.toString(all[1]));// print second Array - index 1

        int [][] twoD = {{2,3,4,5,4},{4,5,6,6,55,44,4},{3},{3,4,5,6,0}};

        System.out.println(twoD[0].length);//4....
    }
}
