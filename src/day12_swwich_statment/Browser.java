package day12_swwich_statment;

import java.util.Scanner;

public class Browser {
    /*

    ask a user to enter Browser type
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your browzer: ");

        String browser = input.next();

        System.out.println("Enter a URL: ");
        String url = input.next();

        switch (browser){
            case "chrome":
            case "Chrome":
            case"CHROME":
                System.out.println("Going into "+ url+" in chrome browser");
                break;
            case "edge":
                System.out.println("Going into "+ url+" in "+ browser + " browser");
                break;
            case "safari":
                System.out.println("Going into "+ url+" in "+browser+ " browser");
                break;
            case "firefox":
                System.out.println("going into "+ url+" in "+browser+ " browser");
                break;
            default:
                System.out.println(" is invalid browser");
        }


    }
}
