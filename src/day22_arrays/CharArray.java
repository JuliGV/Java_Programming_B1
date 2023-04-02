package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String [] letter = {"l","o","o","p"};
        System.out.println(Arrays.toString(letter));
        String word ="loop";

        //toCharArray();
        char [] convertedWord = word.toCharArray();
        System.out.println(Arrays.toString(convertedWord));
        System.out.println(convertedWord[0]);
        System.out.println(convertedWord[1]);
        System.out.println(convertedWord[2]);
        System.out.println(convertedWord[3]);

        System.out.println("--------------");

        for (char let:convertedWord) {
            System.out.println(let);

        }

        String days  = "Monday - Sundays";

        char [] letterDay = days.toCharArray();
        System.out.println(letterDay[0]);
        System.out.println(Arrays.toString(letterDay));
    }
}
