package day15_string;

import java.util.Scanner;

public class ShortersWithA {
    public static void main(String[] args) {
        /*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 word");


        String word1 = input.next(), word2 = input.next(), word3 = input.next();

        int wordOne = word1.length(), wordTwo = word2.length(), wordThree = word3.length();

        String result ="";

        if (word1.contains("a") && (wordOne<=wordTwo && wordOne<=wordThree)){
            result = word1+" is the shortest with \"a\"";
        }else if (word2.contains("a") && (wordTwo<=wordOne && wordTwo<=wordThree)) {
            result = word2 + " is the shorterst with \"a\"";
        }else if (word3.contains("a") && (wordThree<=wordTwo && wordThree<=wordOne)) {
            result = word3 + " is the shortest with \"a\"";
        }else{
            System.out.println("No single word with \"a\"");
        }
        System.out.println(result);



    }
}
