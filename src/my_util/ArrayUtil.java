package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     *
     * @param arr
     * @return
     */


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
}
