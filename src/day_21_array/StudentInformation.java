package day_21_array;
/*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number
     */

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {

    public static void main(String[] args) {
        String [] student1 = {"b001","Tom","Jerry","1"};
        System.out.println(" The info for student 1: "+ Arrays.toString(student1));

        String[] student2 = new String[4];//create new array
        System.out.println(" The info for student 2: "+ Arrays.toString(student2));//print null 4 times

        student2 [0] = "b002";// assign info for each
        student2 [1] = "James";
        student2 [2] = "Bond";
        student2 [3] = "2";

        System.out.println(" The info for student 2: "+ Arrays.toString(student2));

        String[] student3 = new String[4];
        Scanner input = new Scanner (System.in);

        System.out.println("Enter id");
        student3[0]= input.next();

        System.out.println("Enter name");
        student3[1]= input.next();

        System.out.println("Enter last name");
        student3[2]= input.next();

        System.out.println("Enter Batch");
        student3[3]= input.next();
        System.out.println(Arrays.toString(student3));


        String [] question = {"Enter id","Enter name","Enter last name","Enter Batch"};

        String [] student4 = new String [4];

        for (int i = 0; i < question.length; i++) {// for  student number 4
            System.out.print(question[i]);
            student4[4]= input.next();

        }
        System.out.println(Arrays.toString(student4));




    }
}
