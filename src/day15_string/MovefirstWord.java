package day15_string;

import java.util.Scanner;

/*
   [Move first word]
       Given a sentence. Display the sentence with the first word moved to the end of the sentence.
       Ex:
       Input: Java is a fun language
       Output: is a fun language Java
       Hint: Use indexOf and substring
    */

public class MovefirstWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        //Java is fun language


        int firstspace = sentence.indexOf(" ");
        String begining = sentence.substring(0,firstspace);


        String second = sentence.substring(firstspace+1);

        System.out.println(begining);
        System.out.println(second);
        System.out.println(second+" "+begining);

    }
}
