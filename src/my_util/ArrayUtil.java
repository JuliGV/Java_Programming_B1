package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     *
     * This method accept int arr and return int the min number
     *
     */


    public static int  minNumInArr (int [] arr ){
        int min = 0;

        for (int each:arr ) {
            if (each< min){
                min = each;
            }

        }return min;

    }

    /**
     * This method will accept int arr and int number
     * it will return if the number exist in the array
     *
     *
     */

    public static boolean containArr (int [] arr,int num){
//        boolean result = false;
        for (int each:arr) {
            if (num == each){
//                return = true;
                return true;
            }
        }
        return false;
//        return result;
    }


    public static int minNumInArrSort (int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    /**
     *
     * This method accept int arr and int number
     * Return int index of the number
     * if it doesn't exist it return -1
     */

    public static int indexOf2 (int [] arr,int num){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return i;
            }
        }return -1;

    }

    /**
     *
     * This method accept String arr and String word
     *      * Return int index of the word
     *      * if it doesn't exist it return -1
     */

    public static int indexOf2 (String [] arr,String word){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)){
                return i;
            }
        }return -1;

    }

    /**
     *
     * This method accepts int array and the int num
     * And returns the a new array with the num added at the end
     */
    public static int [] add (int [] arr, int num) {

        int [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;

        return newArr;

    }

    /**
     *
     * This method accepts String array and the String word
     * And returns the new array with the word added at the end
     */
    public static String [] add (String [] arr, String word) {

        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;

        return newArr;

    }
}
