package day12_swwich_statment;

import java.util.Scanner;

public class VnendingMachine {
    public static void main(String[] args) {
        System.out.println("Welcome to vending Machine");
        System.out.println("Please, select one of : \n\tDrinks\n\tSnacks\n\tGum\n\nEnter");
        Scanner input = new Scanner (System.in);
        String selection = input.next();
        String msg;

        switch (selection){
            case "Drinks":
                System.out.println("Your chose drinks: (click 1,2,3) \n1)Watter\n2)Soda\n3)Juise");
                int drinkNumber = input.nextInt();
                if ( drinkNumber==1){
                    msg = "you are selected water";

                }else if (drinkNumber==2){
                    msg = "You are selected Sode";
                }else if (drinkNumber==3){
                    msg = "You are selected Juise";

                }else {
                    msg = "Invalid input";
                }
                break;
            case "Snacks":
                System.out.println("Your chose snacks: (click 1,2,3) \n1)Candies\n2)Pringles\n3)Chips");
                int snacksnumber = input.nextInt();
                if ( snacksnumber==1){
                    msg = "you are selected Candies";

                }else if (snacksnumber==2){
                    msg = "You are selected Pringles";
                }else if (snacksnumber==3){
                    msg = "You are selected Chips";

                }else {
                    msg = "Invalid input";
                }
                break;

            case "Gum":
                System.out.println("Your chose drinks: (click 1,2,3) \n1)Love\n2)Turbo\n3)Dirol");
                int gumNumber = input.nextInt();
                if ( gumNumber==1){
                    msg = "you are selected Love";

                }else if (gumNumber==2){
                    msg = "You are selected Turbo";
                }else if (gumNumber==3){
                    msg = "You are selected Dirol";

                }else {
                    msg = "Invalid input";
                }
                break;
            default:
                msg= "Not valied selection";
        }
        System.out.println(msg);
    }
}
