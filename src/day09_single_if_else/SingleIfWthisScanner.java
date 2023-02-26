package day09_single_if_else;

import java.util.Scanner;

public class SingleIfWthisScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Why are we doing this");
        String answer = input.nextLine();

        System.out.println("Is Java fun(true or false? ");
        boolean answer2 = input.nextBoolean();

        if(answer2){
            System.out.println("Feyrus is really happy");
        }

    }
}
