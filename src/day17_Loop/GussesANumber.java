package day17_Loop;

import java.util.Scanner;

public class GussesANumber {
    public static void main(String[] args) {
        // ask user enter the number from 1-100
        // check a number if it is lower than my guessed number - > it is to lowe
        // check a number if it is lower than my guessed number - > it is to high
        // check a number correct guessed number - > it is correct


        Scanner input = new Scanner(System.in);

        int guessNumber = 5;
        int num;

        do {

            System.out.print("Guess a number: ");
            num = input.nextInt();

            if (num < guessNumber) {
                System.out.println("it is to lowe");
            } else if (num > guessNumber) {
                System.out.println("it is to high");
            }
        } while (num != guessNumber);

        System.out.println("You are guess");


    }
}
