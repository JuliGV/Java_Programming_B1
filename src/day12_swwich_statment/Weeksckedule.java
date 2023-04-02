package day12_swwich_statment;

import java.util.Scanner;

public class Weeksckedule {
    /*

    Enter a day of week
    print which class we have of that day

    Monday
    Mon
    monday
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day of the week");

        String day = input.next();

        String message = "";



        switch (day){
            case "Monday":
            case "Mon":
            case "monday":
            case "tuesday":
            case "Tuesday":
            case "Tus":
            case "Friday":
            case "Fri":
            case "friday":
                message = "We don't have a class";
                break;
            case "Wednesday":
            case "Wen":
            case "wednesday":
            case"Thursday":
            case "Thu":
            case "thursday":
            case "Saturday":
                message = "We have a java class";
                break;
            case "Sunday":
                message = "We have soft skill class";
            default:
                message = "Invalid";
                break;


        }

        System.out.println(message);
    }






}
