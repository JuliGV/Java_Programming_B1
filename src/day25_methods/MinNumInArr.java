package day25_methods;

import java.util.Arrays;

public class MinNumInArr {
    public static int  minNumInArr (int [] arr ){
        int min = 0;

        for (int each:arr ) {
            if (each< min){
                min = each;
            }

        }return min;

    }

    public static int minNumInArrSort (int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static int minNumInArrSort2 (int ... arr){ //varargs
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        System.out.println(minNumInArrSort2(76,98,9,76));
    }

}

