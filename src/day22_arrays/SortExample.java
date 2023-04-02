package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int [] num = {2,3,8,1,4,7,-4};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("min: "+num[0]);
        System.out.println("max: "+num[num.length-1]);

        int [] num2 = {20,30,80,10,40,70,-40};
        int [] num3 = num2;// we not made new array


        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
    }
}
