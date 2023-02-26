package day07_relation_operation;

import org.w3c.dom.ls.LSOutput;

public class OperatorPractice {

    public static void main (String [] args) {

        int i = 5;
        int y = -i++ + --i + i++/i--;
        // y = - 5+ 5+5/6; i =5

        System.out.println(i);
        System.out.println(y);

        int d = 31%10;
        System.out.println(d);
    }



}
