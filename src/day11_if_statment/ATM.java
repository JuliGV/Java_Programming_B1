package day11_if_statment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("***wWELCOME to ATM\n\nPlease, insert your card and enter 4 digits pin code\n\tPINCODE: ");
        int userPin = input.nextInt();
        int expectetPin = 3456;

        if (userPin==expectetPin){
            System.out.println("Logged in");
            System.out.println("Select one of the option");
            System.out.println("\t1-Check Balance");
            System.out.println("\t2-Withdraw");
            System.out.println("\t3-Deposit");
            System.out.println("\t4- Enter option");

            int option = input.nextInt();

            if (option==1){
                System.out.println("Your balance : 10000");

            }else if(option==2){
                System.out.println("How much do you want withdraw?");
                double withdraw = input.nextDouble();
                System.out.println("You are withdrawing "+withdraw);

            }else if (option==3){
                System.out.println("Please deposit the money");
            }

        }else {
            System.out.println("Invalid pin");
        }
    }
}
