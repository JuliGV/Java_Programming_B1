package day12_swwich_statment;

import java.util.Scanner;

public class Starbucks {

    /*

 Declare price and calories variables

 Ask the user to enter which size drink they want

 Based on the drink size determine the price and calories of the order

 At the end print the details of the order

     data:

         size: tall
         price: 2.50
         calories: 100

         size: grande
         price: 4.00
         calories: 150

         size: venti
         price: 4.50
         calories: 200

  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which size of drink you want? ");

        double price = 0.0;
        int calories = 0;
        boolean isSize = true;


        String size = input.next();

        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We don't have this type of coffee");
                isSize = !true;


        }
        if (isSize) {
            System.out.println("Your order for " + size + " coffee price is " + price + " and calories " + calories);
        }
    }
}

