package day26_methods;
/*
Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.
 */

public class ContainArray {
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


    public static void main(String[] args) {
        int [] arr = {1,2,54,5,5,6};
        int num = 5;
        System.out.println(containArr(arr, num));
        System.out.println(containArr(new int[]{1, 2, 3}, 3));
    }
}
