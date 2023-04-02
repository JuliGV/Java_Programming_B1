package day18_loops;
/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words in sentenses
    Output:
    4
 */

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {



            if (sentence.charAt(i) == ' '){
                count++;

            }

        }
        System.out.println("Count of words is "+(count+1));



//        System.out.println(sentence);

    }

}
