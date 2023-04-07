package day26_methods;

import my_util.ArrayUtil;

import java.util.Arrays;

public class AddElement {
    /*
    create a method that accept int arr ant int number
    then adds that value at the end of array
     */

    public static void main(String[] args) {
        int [] arr = {76,98,67,9,9,55,};
        System.out.println(Arrays.toString(addElement(arr, 7)));

    }

    public static int [] addElement (int [] arr, int num){
        int [] newArr = Arrays.copyOf(arr,arr.length+1);
//        newArr[newArr.length-1]=num;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == newArr.length-1){
                newArr[i]=num;

            }
        } return newArr;


        }
    }

