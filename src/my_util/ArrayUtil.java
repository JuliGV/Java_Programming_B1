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

    /**
     * Accept int num and int arr and return new arr with new number at the begining
     * @param num
     * @param arr
     * @return
     */

    public static int [] addEmementBegining (int num, int ... arr){
        int [] newArr = new int[arr.length+1];
        for (int i = 1; i < newArr.length; i++) {

            newArr[i]= arr[i-1];/// why i-1 because we start assign in arr from 0 and newArr from 1 index, we get 0 index 0 ---->0

        }
        newArr[0]= num;///
        return newArr;

    }

    /**
     * Accept String word and String  arr and return new arr with new String arr  add new word at the begining
     * @param num
     * @param arr
     * @return
     */



    public static String [] addEmementBegining (String  word, String  ... arr){

        String  [] newArr = new String[arr.length+1];
        for (int i = 1; i < newArr.length; i++) {

            newArr[i]= arr[i-1];/// why i-1 because we start assign in arr from 0 and newArr from 1 index, we get 0 index 0 ---->0

        }
        newArr[0]= word;///
        return newArr;

    }
}
