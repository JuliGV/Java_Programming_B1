package day09_single_if_else;

import java.util.Scanner;

public class CheckHundred {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you hungry?(true or false): ");
        boolean answer = input.nextBoolean();

        if (answer){
            System.out.println("Let's go to Taxas");
        }else{
            System.out.println("Thanks");
        }
    }
}
