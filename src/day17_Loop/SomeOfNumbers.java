package day17_Loop;

import java.util.Scanner;

public class SomeOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int numOfSum = 0;

        // continue getting a number from user until it is negative number

        while (num >=0){

            numOfSum = numOfSum+num;
            System.out.println("Sume of number so far is: "+numOfSum);

            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num < 0 ){
                System.out.println("User number is negative number, that is why while loop ended");
            }
        }
    }
}
