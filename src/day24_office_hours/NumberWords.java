package day24_office_hours;
/*

write a method that accept the number between 1 and 10
And return as a word

Ex
numWord (4)
four
 */

import java.util.Scanner;

public class NumberWords {
    public static String numberWord (int num){

//        if (num == 1){// we can do with switch as well
//            return "One";
//        }else if (num == 3){
//            return "three";
//        }
        if (num> 10 || num<1) {
//            System.out.println("Number is not in the range");
            return "Number is not in the range";

        }// we can use else but we can not use because then method retorn the value is end, skip of the rest part

            String[] words = {"one", "two", "three", "four", "five", "six", "seven"};
            ///String [] words = {"",one","two","three","four","five","six","seven"};if you want without num - 1
            //                   0     1     2        3      4      5      6
            return words[num - 1]; //num - 1 because index start from 0

    }

    public static void main(String[] args) {
        String result = numberWord(3);//1 ways print
        System.out.println(result);

        System.out.println(numberWord(1));//2 way

        System.out.println("__________");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numUser = input.nextInt();
        System.out.println(numberWord(numUser));
    }

}
