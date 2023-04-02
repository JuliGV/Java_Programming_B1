package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name with title");
        String nameTitle = input.next();


        nameTitle = nameTitle.toLowerCase();


        if ((nameTitle.startsWith("mr")) || (nameTitle.startsWith("mister"))){
            System.out.println("Hello Sir");
        }else if (nameTitle.startsWith("ms") || (nameTitle.startsWith("madam"))){
            System.out.println("Hello Ma'am");
        }else if (nameTitle.startsWith("dr") || (nameTitle.startsWith("doctor"))){
            System.out.println("Hello Doctor");
        }

        if (nameTitle.endsWith("jr")){
            System.out.println("Hello Junior");
        }else if (nameTitle.endsWith("sr")){
            System.out.println("Hello Senior");
        }






    }
}
