package day26_methods;

import java.util.Arrays;

public class ArrayIndexOf {
    public static void main(String[] args) {

        String str = "loop";
        int index = str.indexOf("l");

        int [] arr = {3,56,87,43,1};
        int num = 87;
        System.out.println(indexOf(arr, num));
        System.out.println(indexOf2(arr, num));
        System.out.println(indexOf2(new String[]{"loop", "Tom", "Jerry"}, "Jerry"));

    }

    public static int indexOf (int [] arr,int num){

        int location = 0;

        for (int each: arr) {

            if (each==num){

                return location;

            }else{
                location++;
            }

        }return -1;
    }

    public static int indexOf2 (int [] arr,int num){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return i;
            }
        }return -1;

    }

    public static int indexOf2 (String [] arr,String word){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)){
                return i;
            }
        }return -1;

    }
}
