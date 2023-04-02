package day23_multidimensional_arrays;
/*

        Have a starting array
        you want to add a number to the end
        so make your array bigger to store the new number

        Ex:
            {45, 123, 62}
            adding 100
            {45, 123, 62, 100}

 */

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};

        Scanner input = new Scanner (System.in);
        System.out.println("What do you want your array size to be");

        int arrOne = input.nextInt();

        int [] arr1 = new int [arrOne];// make array that user give me
        System.out.println(Arrays.toString(arr1));/// [ 0 0 0]

        System.out.println("Add your elements one at a time: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("How many elements you want to add: ");

        int addNum = input.nextInt();
        int [] arr2 = Arrays.copyOf(arr1,arr1.length+addNum);
        System.out.println(Arrays.toString(arr2));

        System.out.println("How many elements one at a time for additional spaces: ");// add more elements without value
        for (int i = arr1.length; i < arr2.length; i++) { // change only array that we give the last time
            arr2[i]= input.nextInt();

        }
        System.out.println(Arrays.toString(arr2));

    }
}
