package day09_single_if_else;

import java.util.Scanner;

public class BankAcount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = input.nextDouble();


        System.out.println("How much are want to withdraw? ");
        double withdraw = input.nextDouble();

        balance = balance - withdraw;

        if(balance<0){
            System.out.println("You can not withdraw");
        }else{
            System.out.println("Your new balance is :"+balance);
        }


        //System.out.println("New balance "+balance);
    }
}
