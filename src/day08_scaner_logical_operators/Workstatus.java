package day08_scaner_logical_operators;


import java.util.Scanner;
public class Workstatus {
    public static void main(String[] args) {

        /*
        create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean
         */

        Scanner input = new Scanner (System.in);
        System.out.print("Enter your first name:");
        String firstNamne = input.next();
        System.out.println("First name:\t"+firstNamne);

        System.out.println("Enter your last name:");
        String lastName = input.next();

        System.out.println("How are you?");
        String feeling = input.next();

        System.out.println("What is the best team?");
        String team = input.next();
        input.nextLine();
        System.out.println("How much are you making?");
        String salary = input.nextLine();



        System.out.println("First name:\t"+firstNamne+"\nLast name:\t"+lastName);
        System.out.println("How are you:"+feeling);
        System.out.println("best team ever:\t");
        System.out.println("How much are you making?"+salary);





    }


}
