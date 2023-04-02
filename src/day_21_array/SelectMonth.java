package day_21_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which month you want?");
        int monthNum = input.nextInt();

        String [] allMonth = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Now","Dec"};
        System.out.println("The number you enter "+allMonth[monthNum-1]);

    }
}
