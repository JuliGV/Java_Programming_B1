package day17_Loop;

import java.util.Scanner;

public class ATMLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to ATM");
        int attend = 1;
        int validPin = 1234;
        int userPin;


        /*
        ask user enter a pin
        after 3 invalid pin attend end asking user
         */




        do{
            System.out.println("Enter a pin: ");
             userPin = input.nextInt();
            attend++;

        }while (attend<=3 && validPin !=userPin);

        if (validPin==userPin){

            System.out.println("You are logged in");
        }else {
            System.out.println("You are logged out. Please contact service");
        }
    }
}
