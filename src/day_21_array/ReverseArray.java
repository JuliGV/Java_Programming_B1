package day_21_array;
/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
 */

public class ReverseArray {
    public static void main(String[] args) {
        int [] nums =  {1, 2, 3, 4, 5};
        for (int i = nums.length-1; i >= 0 ; i--) {
            System.out.print(nums[i]+", ");

        }
    }
}
