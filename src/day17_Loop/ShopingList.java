package day17_Loop;

import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String list ="Shoping list";
        String addMore = "";

        do {


            System.out.println("Enter the name of an item:");
            //String newItem = input.next();
            list += "\n\t" + input.next();

            System.out.println("Do you want to add more to your shopping list");
             addMore = input.next();

        }while (addMore.equalsIgnoreCase("yes"));

        System.out.println(list);




    }
}
