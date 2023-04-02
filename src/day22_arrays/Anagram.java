package day22_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 = "listen";

        char [] word11 = word1.toCharArray();
        char [] word22 = word1.toCharArray();


        Arrays.sort(word11);
        Arrays.sort(word22);


        System.out.println(Arrays.equals(word11,word22));


    }
}
