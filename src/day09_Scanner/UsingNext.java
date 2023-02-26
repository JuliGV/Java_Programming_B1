package day09_Scanner;

import java.util.Scanner;


public class UsingNext {

    public static void main(String[] args) {
        // create a scanner object

        Scanner input = new Scanner(System.in);

        System.out.println("Today is Saturday");
        System.out.print("what is todays class? ");

        String ClassName  = input.next();
        System.out.println();

        System.out.print("What month is it? ");
        String month = input.next();



        System.out.println("I like "+month+"month");
        System.out.println();

        input.nextLine();


        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
       System.out.println("Full name is "+fullName);

       // in Scanner is a method called .close();




    }
}
