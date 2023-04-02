package day17_Loop;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int count = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        while (count<=5){
            System.out.print("Enter a number: ");
            int num = input.nextInt();//3


            if (max<num){
                max = num;
            }if (min>num){
                min = num;
            }

            count++;
        }
        System.out.println(min);
        System.out.println(max);







//        int count = 1;
////        int max = num;
//        int min = Integer.MAX_VALUE;
//
//
//        while (count<=5){
//            System.out.print("Enter a number: ");
//            int num = input.nextInt();//3
//
//
//            if (num>min){
//                min = num;
//            }if (num<max){
//                min = num;
//            }
//
//            count++;
//        }
//        System.out.println(min);
//        System.out.println(max);

    }

}
