package day18_loops;

import java.util.Scanner;

public class ReversMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter 3 words:");
        String str = input.nextLine();

        int firstSpace = str.indexOf(" ");

        int lastSpace = str.lastIndexOf(" ");


        String middle = str.substring(firstSpace+1,lastSpace);
        String revers = "";

        for (int i = middle.length()-1; i >=0; i--) {
            revers+=middle.charAt(i);

        }
        System.out.println(str.substring(0,firstSpace+1)+revers+str.substring(lastSpace));
    }
}
