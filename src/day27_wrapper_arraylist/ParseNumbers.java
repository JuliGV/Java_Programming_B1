package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        String year = "2022";
        int yearIntnum = Integer.parseInt(year);/// int data type ---> 2022
        System.out.println("this year is "+year);
        System.out.println("Next year will be "+year+1);//concatination will be ---> 20221
        System.out.println("Next year will be "+(yearIntnum+1));//it will be 2023 because we convert String into int

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age");
        String userInput = input.nextLine();

        String age = userInput.split(" ")[2];
        int ageAsNum = Integer.parseInt(age);

        System.out.println("You will be "+(ageAsNum+10)+"  after 10 years");





    }
}
