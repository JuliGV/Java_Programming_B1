package day29_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> shopingList = new ArrayList<>();
        String wants;
        int count = 0;

        do{
            System.out.println("Enter the item:");
            shopingList.add(input.nextLine());

            System.out.println("Do you want to continue?");
             wants = input.nextLine();
            //boolean result = wants.equalsIgnoreCase("Y");
        }while(wants.equalsIgnoreCase("Y"));
        System.out.println("Shoping list: "+shopingList.size()+" items");

        for (String each:shopingList){
            System.out.println(++count+"\t"+each);
        }
        System.out.println();

        //how can I check if Water is on the list
        System.out.println("Do you want to check?");
        String item = input.nextLine();
        System.out.println(shopingList.contains(item)? (item+ " in the list") :  (item+" is not on your list"));


        // can you remove specific item

        System.out.println("What item do you want to remove");

        if (input.nextLine().equalsIgnoreCase("y")){
            System.out.println("What item do you want to remove");
            String removeItem = input.nextLine();
            // user give either number of item or name item

            if (Character.isDigit(removeItem.charAt(0))){
                shopingList.remove(Integer.parseInt(removeItem)-1);
            }else{
                shopingList.remove(removeItem);
            }

        }
        System.out.println("Final shopinglist:"+shopingList);

    }
}
